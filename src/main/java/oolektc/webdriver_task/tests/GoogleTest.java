package oolektc.webdriver_task.tests;

import oolektc.webdriver_task.pageobjects.HomePage;
import oolektc.webdriver_task.pageobjects.ImagesPage;
import oolektc.webdriver_task.pageobjects.SearchResultPage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static oolektc.webdriver_task.locators.Locators.*;


public class GoogleTest extends TestRunner {

    private static final String URL = "https://www.google.com/";

    @Test
    public void googleImagesTest() {
        driver.get(URL);
        HomePage homepage = new HomePage(driver);

        SearchResultPage searchResultPage = homepage.doSearchFor("funny picture");
        Assert.assertTrue(driver.findElement(FIRST_RESULT_LINK)
                        .getText()
                        .contains("funny picture"),
                "Link does not contain 'funny picture text'");

        final ImagesPage imagePage = searchResultPage.clickImagesTab();
        final List<WebElement> listOfImages = imagePage.getListOfElements(IMAGES_PAGE_IMAGE);
        listOfImages
                .stream()
                .limit(5)
                .forEach(element -> Assert.assertTrue(element.isDisplayed(),
                        "Images are not displayed"));

        imagePage.takeScreenshot("screenshot.png");

        homepage = imagePage.clickOnGoogleLogo();
        Assert.assertTrue(driver.findElement(LOGO).isDisplayed(),
                "Google logo is not displayed");
        homepage.hideElement(driver.findElement(LOGO));
        Assert.assertFalse(driver.findElement(LOGO).isDisplayed(),
                "Google logo is not hidden");

        searchResultPage = homepage.doSearchFor("funny kitten picture");
        Assert.assertTrue(driver.findElement(FIRST_RESULT_LINK)
                        .getText()
                        .toLowerCase()
                        .contains("funny kitten picture"),
                "Link does not contain 'funny kitten picture' text");

        searchResultPage.changeElementColor(driver.findElement(FIRST_RESULT_LINK), "'rgb(52, 221, 221)'");
        Assert.assertTrue(driver.findElement(FIRST_RESULT_LINK)
                        .getAttribute("style")
                        .equals("color: rgb(52, 221, 221);"),
                "First link color in not changed");

    }
}