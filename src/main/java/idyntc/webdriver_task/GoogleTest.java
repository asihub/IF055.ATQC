package idyntc.webdriver_task;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static idyntc.webdriver_task.Locators.*;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class GoogleTest {

    private WebDriver driver;
    private WebElement element;
    private JavascriptExecutor javaScript;

    public void doScreenShots (){
        try {
            File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(sourceFile, new File(SCREENSHOT_FILE_PATH));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void Search(String someText){
        driver.findElement(By.name(GOOGLE_SEARCH_LOCATOR)).sendKeys(someText);
    }

    @BeforeTest
    public void setUp() {
        driver = new FirefoxDriver();
        driver.get(GOOGLE_URL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void testSearchImages() {
        Search("funny picture");

        element = driver.findElement(By.cssSelector(FUNNY_PICTURE_LINK_LOCATOR));
        Assert.assertTrue(element.getText().toLowerCase().contains("funny picture"));

        driver.findElement(By.xpath(GOOGLE_IMAGES_LOCATOR)).click();
       
        List<WebElement> elementsList = driver.findElements(By.cssSelector(FUNNY_PICTURES_LOCATOR));

        if (elementsList.size() >= 5) {
            doScreenShots();
        }
        driver.findElement(By.cssSelector(BACK_TO_HOME_PAGE_LOGO_LOCATOR)).click();
    }

    @Test 
    public void testHideGoogleLogo() {
        
        element = driver.findElement(By.cssSelector(GOOGLE_LOGO_LOCATOR));
        Assert.assertTrue(element.isDisplayed());

        javaScript = (JavascriptExecutor) driver;
        javaScript.executeScript(HIDE_GOOGLE_LOGO_SCRIPT);

        element = driver.findElement(By.cssSelector(GOOGLE_LOGO_LOCATOR));
        Assert.assertFalse(element.isDisplayed());
    }


    @Test 
    public void testSearchKittenImages() {
        Search("funny kitten picture");

        element = driver.findElement(By.cssSelector(FUNNY_PICTURE_LINK_LOCATOR));
        Assert.assertTrue(element.getText().toLowerCase().contains("funny kitten picture"));
    }

    @Test (dependsOnMethods = "testSearchKittenImages")
    public void testChangeColorLink() {
        element = driver.findElement(By.cssSelector(FUNNY_PICTURE_LINK_LOCATOR));
        javaScript = (JavascriptExecutor) driver;
        String colorLink = (String)javaScript.executeScript(CHANGE_LINK_COLOR_SCRIPT);
        Assert.assertTrue(colorLink.equals("red"));

    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}




