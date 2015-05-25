package iilntc;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.File;
import java.util.concurrent.TimeUnit;

/**
 * Created by Ihor Ilnytskyi on 21.05.2015.
 */

public class TestGoogle {
    private WebDriver maDriver;
    private JavascriptExecutor js;

    @BeforeTest
    public void getDriver(){
        maDriver = new FirefoxDriver();
        maDriver.navigate().to("https://google.com.ua");
        maDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        maDriver.manage().window().maximize();
    }

    @Test
    public void testGoogleSite() throws Exception {
        maDriver.findElement(By.id("lst-ib")).sendKeys("funny picture");
        maDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        maDriver.findElement(By.xpath("//li[1]/div[@class='rc']/h3/a[contains(text(), 'funny picture')]"));
        maDriver.findElement(By.xpath("//*[@id='hdtb-msb']/div[2]/a")).click();
        Assert.assertTrue(maDriver.findElements(By.cssSelector("img")).size() >= 5);
        FileUtils.copyFile(((TakesScreenshot) maDriver).
                getScreenshotAs(OutputType.FILE), new File("c:\\screenshoot.png"));
        maDriver.navigate().back();
        maDriver.navigate().back();
        maDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        //Look for google logo
        maDriver.findElement(By.cssSelector("div[id='hplogo'][style^=background]"));

        //Logo deleting
        js = (JavascriptExecutor) maDriver;
        js.executeScript("hplogo.setAttribute('style', '');", "document.getElementById('hplogo')");

        //org.openqa.selenium.NoSuchElementException
        //maDriver.findElement(By.cssSelector("div[id='hplogo'][style^=background]"));

        maDriver.findElement(By.id("lst-ib")).sendKeys("funny kitten picture");
        maDriver.findElement(By.xpath("//li[1]/div[@class='rc']/h3/a")).getText().toLowerCase().equals("funny kitten picture");

        //JavascriptExecutor jss = (JavascriptExecutor) maDriver;
        //jss.executeScript("r.setAttribute('style', '');", "document.querySelectorAll('h3.r')");




    }
    @AfterTest
    public void closeDriver(){
        //maDriver.quit();
    }
}


