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

public class TestGoogle {
    private WebDriver driver;
    private JavascriptExecutor js;

    @BeforeTest
    public void getDriver(){
        driver = new FirefoxDriver();
        driver.navigate().to("https://google.com.ua");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void testGoogleSite() {
        driver.findElement(By.id("lst-ib")).sendKeys("funny picture");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//li[1]/div[@class='rc']/h3/a[contains(text(), 'funny picture')]"));
        driver.findElement(By.xpath("//*[@id='hdtb-msb']/div[2]/a")).click();
        Assert.assertTrue(driver.findElements(By.cssSelector("img")).size() >= 5);
        FileUtils.copyFile(((TakesScreenshot) driver).
                getScreenshotAs(OutputType.FILE), new File("c:\\screenshoot.png"));
        driver.navigate().back();
        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        //Look for google logo
        driver.findElement(By.cssSelector("div[id='hplogo'][style^=background]"));

        //Logo deleting
        js = (JavascriptExecutor) driver;
        js.executeScript("hplogo.setAttribute('style', '');", "document.getElementById('hplogo')");

        //org.openqa.selenium.NoSuchElementException
        //driver.findElement(By.cssSelector("div[id='hplogo'][style^=background]"));

        driver.findElement(By.id("lst-ib")).sendKeys("funny kitten picture");
        driver.findElement(By.xpath("//li[1]/div[@class='rc']/h3/a")).getText().toLowerCase().equals("funny kitten picture");

        //JavascriptExecutor jss = (JavascriptExecutor) driver;
        //jss.executeScript("r.setAttribute('style', '');", "document.querySelectorAll('h3.r')");




    }
    @AfterTest
    public void closeDriver(){
        //driver.quit();
    }
}


