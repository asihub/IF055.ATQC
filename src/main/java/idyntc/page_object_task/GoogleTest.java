package idyntc.page_object_task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static idyntc.webdriver_task.Locators.GOOGLE_URL;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

/**
 * Created by Ihor-Dynka on 28.05.2015.
 */
public class GoogleTest extends TestRunner{
    List<WebElement> imagesList;
    WebDriver driver;

    @BeforeTest
    public void setUp() {
        driver = new FirefoxDriver();
        driver.get(GOOGLE_URL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @AfterTest
    public void tearDown(){
        driver.quit();
    }
    @Test
    public void testSearchImages(){
        GoogleHomePage googleHomePage = new GoogleHomePage(driver);
        ResultPage resultPage = googleHomePage.search("funny picture");
        assertTrue(resultPage
                .getFirstLink()
                .getText()
                .toLowerCase()
                .contains("funny picture"));

        ImagePage imagePage = resultPage.goToImages();
        imagesList = imagePage.getImagesList();
        imagePage.doScreenshot();
        imagePage.ComeBackToHomePage();
    }
    @Test
    public void testHideGoogleLogo(){
        GoogleHomePage googleHomePage = new GoogleHomePage(driver);
        assertTrue(googleHomePage.getGoogleLogo().isDisplayed());
        googleHomePage.hideLogo();
        assertFalse(googleHomePage.getGoogleLogo().isDisplayed());

    }
    @Test
    public void testSearchKittenImages(){
        GoogleHomePage googleHomePage = new GoogleHomePage(driver);
        ResultPage resultPage = googleHomePage.search("funny kitten picture");
        assertTrue(resultPage
                .getFirstLink()
                .getText()
                .toLowerCase()
                .contains("funny kitten picture"));

        resultPage.getFirstLink();
        resultPage.changeColorLink();
    }
}
