package iilntc;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.util.concurrent.TimeUnit;

/**
 * Created by Ihor Ilnytskyi on 21.05.2015.
 */

/**
 * This class is used to test https://google.com.ua.
 */

public class TestGoogle {
    private WebDriver driver;
    private JavascriptExecutor js;

    //There we are preparing driver to start our test.
    @BeforeTest
    public void setDriver() {
        driver = new FirefoxDriver();
        driver.navigate().to("https://google.com.ua");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    //There we are preparing javascript executor. It will be used in the test to hide google logo and set text color.
    @BeforeTest
    public void setJavascriptExecutor() {
        js = (JavascriptExecutor) driver;
    }

    //There our driver will be closed after passing the tests.
    @AfterTest
    public void closeDriver() {
        driver.quit();
    }

    //This step will be used to make test with "funny picture" request.
    @Test
    public void testFunnyPicture() throws Exception {
        driver.findElement(By.id("lst-ib")).sendKeys("funny picture");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//li[1]/div[@class='rc']/h3/a[contains(text(), 'funny picture')]"));
        driver.findElement(By.xpath("//*[@id='hdtb-msb']/div[2]/a")).click();
        Assert.assertTrue(driver.findElements(By.cssSelector("img")).size() >= 5);
        FileUtils.copyFile(((TakesScreenshot) driver).
                getScreenshotAs(OutputType.FILE), new File("c:\\screenshoot.png"));
    }

    //Next step is for testing related with google logotype.
    @Test(dependsOnMethods = {"testFunnyPicture"})
    public void testGoogleLogo() {
        driver.navigate().back();
        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("div[id='hplogo'][style^=background]"));
        js.executeScript("document.getElementById('hplogo').style.visibility = 'hidden';");
        Assert.assertFalse(driver.findElement(By.cssSelector("div[id='hplogo']")).isDisplayed());
    }

    //A step to test "funny kitten picture" request.
    @Test(dependsOnMethods = {"testGoogleLogo"})
    public void testFunnyKittenPicture() {
        driver.findElement(By.id("lst-ib")).sendKeys("funny kitten picture");
        driver.findElement(By.xpath("//li[1]/div[@class='rc']/h3/a")).getText()
                .toLowerCase().equals("funny kitten picture");
        js.executeScript("arguments[0].style.color = 'red'",
                driver.findElement(By.xpath("//li[1]/div[@class='rc']/h3/a")));
        driver.findElement(By.xpath("//li[1]/div[@class='rc']/h3/a[@style = 'color: red;']"));
    }

}


