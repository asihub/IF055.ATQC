package oarabtc.task_webdriver;

import oarabtc.task_webdriver.page_object.HomePage;
import oarabtc.task_webdriver.page_object.SearchImagePage;
import oarabtc.task_webdriver.page_object.SearchResultPage;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

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
                .contains("funny picture"), "Search text is in the first link");

        final SearchImagePage searchImagePage = searchResultPage.clickImageButton();

        Assert.assertTrue(driver.findElements(IMAGES_LINKS).size() >= 5);
        searchImagePage.takeScreenshot();

        homePage = searchImagePage.clickGoogleLogo();
        Assert.assertTrue(driver.findElement(GOOGLE_MAIN_LOGO).isDisplayed());

        homePage.hideElement(driver.findElement(GOOGLE_MAIN_LOGO));
        Assert.assertTrue(driver.findElement(GOOGLE_MAIN_LOGO).isDisplayed());

        searchResultPage = homePage.searchFor("funny kitten picture");

        Assert.assertTrue(driver.findElement(FIRST_RESULT_LINK)
                .getText()
                .contains("funny kitten picture"), "Search text is in the first link");

        searchResultPage.changeElementColor(driver.findElement(FIRST_RESULT_LINK), "'rgb(33, 555, 77)'");

        Assert.assertTrue(driver.findElement(FIRST_RESULT_LINK)
                .getAttribute("style")
                .equals("color: rgb(33, 555, 77)"));
    }

}
