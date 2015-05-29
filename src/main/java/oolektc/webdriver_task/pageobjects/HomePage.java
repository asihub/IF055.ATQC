package oolektc.webdriver_task.pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import static oolektc.webdriver_task.locators.Locators.*;

public final class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public final SearchResultPage doSearchFor(String searchTerm) {
        driver.findElement(SEARCH_FIELD).clear();
        driver.findElement(SEARCH_FIELD).sendKeys(searchTerm);
        driver.findElement(SEARCH_FIELD).sendKeys(Keys.ENTER);
        return new SearchResultPage(driver);
    }
}
