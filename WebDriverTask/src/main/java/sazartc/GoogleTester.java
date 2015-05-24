package ita.softserve.sazartc;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.Assert;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import java.util.concurrent.TimeUnit;
import java.util.List;
import java.io.File;



/**
 * Google Search testing class
 */
public class GoogleTester {

    private WebDriver driver;
    private String baseUrl = "http://google.com.ua";
    private static final Logger log = LogManager.getLogger(GoogleTester.class);

    @BeforeTest
    public void setUp() {

        log.info("--- Tests started --->");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @AfterTest
    public void tearDown() throws Exception {
        Thread.sleep(3000);
        driver.quit();
        log.info("<--- Tests finished ---");
    }

    @Test
    public void testUntitled() throws Exception {

        driver.get(baseUrl);

        // Search "funny picture"
        try {
            WebElement searchInput = driver.findElement(By.name("q"));
            searchInput.click();
            searchInput.sendKeys("funny picture");
            searchInput.sendKeys(Keys.RETURN);
        } catch (NoSuchElementException nsee) {
            Assert.fail("Something wrong with search input: " + nsee.getMessage());
        }

        // Check first link containing "funny picture" substring
        try {
            WebElement firstLink = driver.findElement(By.xpath(".//*[@id='rso']/div[2]/li[1]/div/h3/a"));
            if (!firstLink.getText().contains("funny picture"))
                    log.warn("firstLink doesn't contains the 'funny picture' substring");
        } catch (NoSuchElementException nsee) {
            log.warn("Something wrong with firstLink: " + nsee.getMessage());
        }

        // Click on the Pictures button
        try {
            WebElement picturesButton = driver.findElement(By.xpath(".//*[@id='hdtb-msb']/div[2]/a"));
            picturesButton.click();
        } catch (NoSuchElementException nsee) {
            Assert.fail("Something wrong with picturesButton: " + nsee.getMessage());
        }

        // Check pictures count
        List<WebElement> pictures = driver.findElements(By.xpath(".//*[@id='rg_s']/div[@class='rg_di rg_el']/a/img"));
        if ( pictures.size() < 5 ) Assert.fail("Pictures count must be at least 5");

        // ...and do a screenshot
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("screenshot.png"));

        // Back to the Google Home
        driver.findElement(By.xpath(".//*[@id='logo']/img")).click();
        //driver.get(baseUrl);

        // Check and hide logo
        try {
            WebElement logo = driver.findElement(By.xpath(".//*[@id='hplogo']"));
            ((JavascriptExecutor)driver).executeScript("arguments[0].style.visibility='hidden'", logo);
            if (logo.isDisplayed()) Assert.fail("Logo must be unvisible now");
        } catch (NoSuchElementException nsee) {
            Assert.fail("Something wrong with logo: " + nsee.getMessage());
        }

        // Search "funny kitten picture"
        try {
            WebElement searchInput = driver.findElement(By.name("q"));
            searchInput.click();
            searchInput.sendKeys("funny kitten picture");
            searchInput.sendKeys(Keys.RETURN);
        } catch (NoSuchElementException nsee) {
            Assert.fail("Something wrong with search input: " + nsee.getMessage());
        }

        // Check first link containing "funny kitten picture" substring
        // and change firstLink color
        try {
            WebElement firstLink = driver.findElement(By.xpath(".//*[@id='rso']/div[2]/li[1]/div/h3/a"));
            if (!firstLink.getText().contains("funny kitten picture"))
                log.warn("firstLink doesn't contains the 'funny kitten picture' substring");
            ((JavascriptExecutor)driver).executeScript("arguments[0].style.color='red'", firstLink);
            Assert.assertEquals(Color.fromString("red"), Color.fromString(firstLink.getCssValue("color")),
                    "Color of the firstLink must be RED");

        } catch (NoSuchElementException nsee) {
            System.out.println("Something wrong with firstLink: " + nsee.getMessage());
        }

        Thread.sleep(1000);

    }





}
