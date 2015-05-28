package idyntc.page_object_task;

import org.openqa.selenium.WebDriver;

/**
 * Created by Ihor-Dynka on 29.05.2015.
 */
public abstract class PageObjectPage {
    protected WebDriver driver;

    public PageObjectPage(WebDriver driver) {
        this.driver = driver;
    }
}
