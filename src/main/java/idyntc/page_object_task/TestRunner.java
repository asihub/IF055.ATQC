/*
* Copyright (C) 2015 PageObjectTask Project by Ihor Dynka
 */
package idyntc.page_object_task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

/**
 * Created by Ihor-Dynka on 29.05.2015.
 */

/**
 * describes all actions which we must do before and after test
 */
public class TestRunner {
    protected WebDriver driver;

    /**
     * opens Firefox browser and sets maximize size
     */
    @BeforeTest
    public void setUp() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    /**
     * closes Firefox browser
     */
    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
