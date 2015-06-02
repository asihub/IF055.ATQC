package iilntc.webdrivertask.testpackage;

import iilntc.webdrivertask.pageobjectpages.HomePage;
import iilntc.webdrivertask.pageobjectpages.PicturesPage;
import iilntc.webdrivertask.pageobjectpages.ResultPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

import static iilntc.webdrivertask.locators_and_scripts.Locators.*;
import static iilntc.webdrivertask.locators_and_scripts.Scripts.*;

/**
 * Created by true on 28.05.2015.
 */
public class GoogleTestPage extends TestRunner {

    private static final String URL = "https://google.com";

    @Test
    public void testSearch() throws IOException {
        driver.get(URL);
        HomePage googleHomePage = new HomePage(driver);
        ResultPage resultPage = googleHomePage.search("funny picture");
        Assert.assertTrue(resultPage.getFirstLinkText().contains("funny picture"));

        PicturesPage picturesPage = resultPage.clickImageButton();
        Assert.assertTrue(picturesPage.getQuantityOfPictures() >= 5);
        picturesPage.takeScreenshot("screenshot.png");

        googleHomePage = picturesPage.clickBackLink();
        Assert.assertTrue(googleHomePage.verifyIsElementDisplayed(GOOGLE_LOGO));

        googleHomePage.executeScript(HIDE_GOOGLE_LOGO);
        Assert.assertFalse(googleHomePage.verifyIsElementDisplayed(GOOGLE_LOGO));

        resultPage = googleHomePage.search("funny kitten picture");
        Assert.assertTrue(resultPage.getFirstLinkText().contains("funny kitten picture"));

        resultPage.executeScript(CHANGE_LINK_COLOUR, driver.findElement(FIRST_LINK));
        Assert.assertTrue(resultPage.verifyIsElementDisplayed(RED_LINK));
    }

}
