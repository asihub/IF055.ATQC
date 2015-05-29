package oolektc.webdriver_task.pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import static oolektc.webdriver_task.locators.Locators.SEARCH_FIELD;

public final class HomePage extends BasePage {
    //TODO overcomplication because of static webdriver
    private static final HomePage HOME_PAGE = new HomePage();

    public static HomePage getHomePage(WebDriver driver) {
        BasePage.driver = driver;
        return HOME_PAGE;
    }

    public SearchResultPage doSearchFor(String searchTerm) {
        driver.findElement(SEARCH_FIELD).clear();
        driver.findElement(SEARCH_FIELD).sendKeys(searchTerm);
        driver.findElement(SEARCH_FIELD).sendKeys(Keys.ENTER);
        return SearchResultPage.getSearchResultPage(driver);
    }
}
