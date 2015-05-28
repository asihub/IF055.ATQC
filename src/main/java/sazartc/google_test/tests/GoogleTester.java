package sazartc.google_test.tests;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;


/**
 * Google Search testing class
 */
@Deprecated
public class GoogleTester {

    private WebDriver driver;
    private String baseUrl = "http://google.com.ua";
    private static final Logger log = LogManager.getLogger(GoogleTester.class);

    @BeforeTest
    public void setUp() {

        log.info("--- Tests started --->");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @AfterTest
    public void tearDown() throws Exception {
        Thread.sleep(3000);
        //driver.quit();
        log.info("<--- Tests finished ---");
    }

    @Test
    public void testUntitled() throws Exception {

        driver.get(baseUrl);

        // Search "funny picture"
        WebElement searchInput = driver.findElement(By.name("q"));
        searchInput.sendKeys("funny picture");
        searchInput.sendKeys(Keys.RETURN);

        // Check first link contains "funny picture"
        WebElement firstLink = driver.findElement(By.xpath(".//*[@id='rso']/div[2]/li[1]/div/h3/a"));
        if (!firstLink.getText().contains("funny picture"))
            log.warn("firstLink doesn't contain the 'funny picture' substring");

        // Click Pictures button
        driver.findElement(By.xpath(".//*[@id='hdtb-msb']/div[2]/a")).click();

        // Check pictures' count
        List<WebElement> pictures = driver.findElements(By.xpath(".//*[@id='rg_s']/div[@class='rg_di rg_el']/a/img"));
        if (pictures.size() < 5) {
            Assert.fail("Pictures count must be at least 5");
        }

        // ...and do a screenshot
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("screenshot.png"));

        // Back to the Google Home
        driver.findElement(By.id("logo")).click();

        // Check and hide logo
        WebElement logo = driver.findElement(By.xpath(".//*[@id='logo']/img"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].style.visibility='hidden'", logo);
        if (logo.isDisplayed()) {
            Assert.fail("Logo must be unvisible now");
        }

        // Search "funny kitten picture"
        searchInput = driver.findElement(By.name("q"));
        searchInput.sendKeys("funny kitten picture");
        searchInput.sendKeys(Keys.RETURN);

        // Check first link contains "funny kitten picture"
        // and change firstLink color
        firstLink = driver.findElement(By.xpath(".//*[@id='rso']/div[2]/li[1]/div/h3/a"));
        if (!firstLink.getText().contains("funny kitten picture"))
                log.warn("firstLink doesn't contain the 'funny kitten picture' substring");
        ((JavascriptExecutor) driver).executeScript("arguments[0].style.color='red'", firstLink);
        Assert.assertEquals(Color.fromString("red"), Color.fromString(firstLink.getCssValue("color")),
                "Color of the firstLink must be RED");
    }
}
