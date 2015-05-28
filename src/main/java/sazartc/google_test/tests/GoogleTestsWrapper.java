package sazartc.google_test.tests;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

/**
 * Wrapper for tests. Initializes and releases resources
 */
public abstract class GoogleTestsWrapper {
    protected WebDriver driver;
    protected static final Logger log = Logger.getLogger(GoogleTester.class);

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
}


