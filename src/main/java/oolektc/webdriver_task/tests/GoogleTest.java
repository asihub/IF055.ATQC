package oolektc.webdriver_task.tests;

import static oolektc.webdriver_task.locators.Locators.*;

import oolektc.webdriver_task.pageobjects.BasePage;
import oolektc.webdriver_task.pageobjects.HomePage;
import oolektc.webdriver_task.pageobjects.ImagesPage;
import oolektc.webdriver_task.pageobjects.SearchResultPage;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import java.util.List;
import java.util.concurrent.TimeUnit;

public class GoogleTest {

    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(BasePage.URL);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void googleImagesTest() {

        HomePage homepage = HomePage.getHomePage(driver);
        SearchResultPage searchResultPage = homepage.doSearchFor("funny picture");
        Assert.assertTrue(driver.findElement(FIRST_RESULT_LINK)
                .getText()
                .contains("funny picture"));

        final ImagesPage imagePage = searchResultPage.navigateToImagesPage();
        final List<WebElement> listOfImages = imagePage.getListOfImages(5);
        listOfImages.forEach(element -> Assert.assertTrue(element.isDisplayed()));

        imagePage.takeScreenshot("c:\\", "screenshot.png");

        homepage = imagePage.navigateToHomePage();
        Assert.assertTrue(driver.findElement(LOGO).isDisplayed());
        homepage.hideElement(driver.findElement(LOGO));
        Assert.assertFalse(driver.findElement(LOGO).isDisplayed());

        searchResultPage = homepage.doSearchFor("funny kitten picture");
        Assert.assertTrue(driver.findElement(FIRST_RESULT_LINK)
                .getText()
                .toLowerCase()
                .contains("funny kitten picture"));

        searchResultPage.changeElementColor(driver.findElement(FIRST_RESULT_LINK), "'rgb(52, 221, 221)'");
        Assert.assertTrue(driver.findElement(FIRST_RESULT_LINK)
                .getAttribute("style")
                .equals("color: rgb(52, 221, 221);"));

    }
}