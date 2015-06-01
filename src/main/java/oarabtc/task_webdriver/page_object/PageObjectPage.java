package oarabtc.task_webdriver.page_object;

import org.openqa.selenium.WebDriver;

public abstract class PageObjectPage {

    protected WebDriver driver;

    public PageObjectPage(WebDriver driver) {
        this.driver = driver;
    }
}
