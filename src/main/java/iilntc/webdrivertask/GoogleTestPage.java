package iilntc.webdrivertask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * Created by true on 28.05.2015.
 */
public class GoogleTestPage {
    private WebDriver driver;

    @BeforeTest
    public void setUp1() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://google.com.ua");
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void testSearch() throws IOException {
        HomePage home1 = new HomePage(driver);
        ResultPage result = home1.search("funny picture");
        Assert.assertTrue(result.getFirstLink().contains("funny picture"));
        PicturesPage pictures = result.getPicturesPage();
        Assert.assertTrue(pictures.picturesPageSize() >= 5);
        driver.navigate().back();
        driver.navigate().back();
        HomePage home2 = new HomePage(driver);
        Assert.assertFalse(home2.hideAndVerifyGoogleLogo());
        ResultPage result2 = home2.search("funny kitten picture");
        Assert.assertTrue(result2.getFirstLink().contains("funny kitten picture"));
        Assert.assertTrue(result2.changeFirstLinkColourAndVerifyIt());
    }

}
