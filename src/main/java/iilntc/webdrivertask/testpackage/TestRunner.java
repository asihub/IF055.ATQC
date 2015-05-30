package iilntc.webdrivertask.testpackage;

import iilntc.webdrivertask.shortcutspackage.Shortcuts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

/**
 * Created by true on 29.05.2015.
 */
public class TestRunner extends Shortcuts{
    protected WebDriver driver;

    protected TestRunner(){
    }

    @BeforeClass
    public void setUp1() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}
