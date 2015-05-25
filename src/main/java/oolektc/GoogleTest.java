package oolektc;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class GoogleTest {

    private static final String URL = "https://www.google.com/";
    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(URL);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void googleImagesTest() {
        driver.findElement(By.id("lst-ib")).sendKeys("funny picture");
        driver.findElement(By.className("lsb")).click();

        Assert.assertTrue(driver.findElement(By.xpath("(.//*[@class='srg']//a)[1]"))
                .getText().contains("funny picture"));

        driver.findElement(By.xpath("(.//*[@id='hdtb-msb']//a)[1]")).click();

        final List<WebElement> listOfImages = driver
                .findElements(By.xpath("(.//*[@id='rg_s']//img)[position() >=1 and position() <=5]"));

        listOfImages.forEach(n -> Assert.assertTrue(n.isDisplayed()));

        try {
            final File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("src\\temp\\screenshot.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        driver.findElement(By.id("logo")).click();
        Assert.assertTrue(driver.findElement(By.id("hplogo")).isDisplayed());
        ((JavascriptExecutor) driver).executeScript("arguments[0].style.visibility='hidden'",
                driver.findElement(By.id("hplogo")));
        Assert.assertFalse(driver.findElement(By.id("hplogo")).isDisplayed());

        driver.findElement(By.id("lst-ib")).sendKeys("funny kitten picture");
        driver.findElement(By.className("lsb")).click();
        Assert.assertTrue(driver.findElement(By.xpath("(.//*[@class='srg']//a)[1]"))
                .getText().toLowerCase().contains("funny kitten picture"));

        ((JavascriptExecutor) driver).executeScript("arguments[0].style.color = 'rgb(52, 221, 221)'",
                driver.findElement(By.xpath("(.//*[@class='srg']//a)[1]")));
        Assert.assertTrue(driver.findElement(By.xpath("(.//*[@class='srg']//a)[1]"))
                .getAttribute("style").equals("color: rgb(52, 221, 221);"));

    }
}