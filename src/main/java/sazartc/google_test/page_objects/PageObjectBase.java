package sazartc.google_test.page_objects;

import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.util.Properties;

public abstract class PageObjectBase {
    protected WebDriver driver;
    final protected Properties properties = new Properties();
    //TODO set property file name elsewhere
    final private String LOCATORS_FILE_NAME = "locators.prop";

    public PageObjectBase(WebDriver driver) {
        this.driver = driver;

        try {
            properties.load(getClass().
                    getClassLoader().
                    getResourceAsStream(LOCATORS_FILE_NAME));
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
