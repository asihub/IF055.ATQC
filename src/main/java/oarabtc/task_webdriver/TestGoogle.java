package oarabtc.task_webdriver;

import oarabtc.task_webdriver.page_object.HomePage;
import oarabtc.task_webdriver.page_object.SearchImagePage;
import oarabtc.task_webdriver.page_object.SearchResultPage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

import static oarabtc.task_webdriver.Locators.*;


public class TestGoogle extends TestRunner {

    private final String GOOGLE_URL = "https://www.google.com/";

    @Test

    public void testPage() throws IOException {

        driver.get(GOOGLE_URL);
        HomePage homePage = new HomePage(driver);

        SearchResultPage searchResultPage = homePage.searchFor("funny picture");

        Assert.assertTrue(driver.findElement(FIRST_RESULT_LINK)
                .getText()
                .contains("funny picture"));

        SearchImagePage searchImagePage = searchResultPage.clickImageButton();


        List<WebElement> listOfImages = searchImagePage.getListOfElements(IMAGES_LINKS);
        listOfImages
                .stream()
                .limit(5)
                .forEach(imageElement -> Assert.assertTrue(imageElement.isDisplayed()));

        searchImagePage.takeScreenshot();

        homePage = searchImagePage.clickGoogleLogo();
        Assert.assertTrue(driver.findElement(GOOGLE_MAIN_LOGO).isDisplayed());

        homePage.hideElement(driver.findElement(GOOGLE_MAIN_LOGO));
        Assert.assertFalse(driver.findElement(GOOGLE_MAIN_LOGO).isDisplayed());

        searchResultPage = homePage.searchFor("funny kitten picture");
        Assert.assertTrue(driver.findElement(FIRST_RESULT_LINK)
                .getText()
                .toLowerCase()
                .contains("funny kitten picture"), "Search text is in the first link");

        searchResultPage.changeElementColor(driver.findElement(FIRST_RESULT_LINK), "'rgb(33, 55, 77)'");

        Assert.assertTrue(driver.findElement(FIRST_RESULT_LINK)
                .getAttribute("style")
                .equals("color: rgb(33, 55, 77);"));
    }
}
