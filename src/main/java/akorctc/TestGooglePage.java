package akorctc;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.lang.*;

//TODO duplicate class
public class TestGooglePage {

    static final String URL = "https://www.google.com/";
    WebDriver driver;

    @BeforeClass
    public void Config() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(URL);
    }

    @Test
    //TODO code convention
    //TODO move out locators

    public void TestPage() {

        // write in searh window
        driver.findElement(By.id("lst-ib")).sendKeys("funny picture");

        // button search
        driver.findElement(By.xpath(".//*[@id='sblsbb']/button")).click();

        // finding first link
        driver.findElement(By.cssSelector(".r>a"));

        //fixed
        Assert.assertTrue(driver.findElement(By.xpath("(.//*[@class='srg']//a)[1]"))
                .getText().contains("funny picture"));

        //button Images
        driver.findElement(By.xpath(".//*[@id='hdtb-msb']/div[2]/a")).click();

        //verify five images
        List<WebElement> listOfImages =
                driver.findElements(By.xpath("(.//*[@id='rg_s']//img)[position() >=1 and position() <=5]"));
        for (WebElement element : listOfImages) {
            Assert.assertTrue(element.isDisplayed());
        }

        // make a screenshot
        File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(sourceFile, new File("src\\0.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        //beck on a head
        driver.get("https://www.google.com/");

        //verify that logo is displayed
        Assert.assertTrue(driver.findElement(By.id("hplogo")).isDisplayed());

        // javacsript that hidden logo
        ((JavascriptExecutor) driver).executeScript("arguments[0].style.visibility='hidden'",

                //verify that logo isn't displayed
                driver.findElement(By.id("hplogo")));

        //verify that logo is displayed
        Assert.assertFalse(driver.findElement(By.id("hplogo")).isDisplayed());


        // write in searh window
        driver.findElement(By.id("lst-ib")).sendKeys("funny kitten picture");

        // button search
        driver.findElement(By.xpath(".//*[@id='sblsbb']/button")).click();

        // finding first link
        driver.findElement(By.cssSelector(".r>a"));

        //fixed
        driver.findElement(By.className("lsb")).click();
        Assert.assertTrue(driver.findElement(By.xpath("(.//*[@class='srg']//a)[1]"))
                .getText().toLowerCase().contains("funny kitten picture"));

        //change the color
        ((JavascriptExecutor) driver).executeScript("arguments[0].style.color = 'rgb(10, 200, 140)'",
                driver.findElement(By.xpath("(.//*[@class='srg']//a)[1]")));

        //verify the color
        Assert.assertTrue(driver.findElement(By.xpath("(.//*[@class='srg']//a)[1]"))
                .getAttribute("style").equals("color: rgb(10, 200, 140);"));

    }

    @AfterClass
    public void shutDown() {
        driver.quit();
    }


}




