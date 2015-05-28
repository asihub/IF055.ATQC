package idyntc.page_object_task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import static idyntc.webdriver_task.Locators.GOOGLE_URL;

/**
 * Created by Ihor-Dynka on 29.05.2015.
 */
public class TestRunner {
    protected WebDriver driver;

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
}
