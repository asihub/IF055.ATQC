package oolektc.webdriver_task.pageobjects;

import static oolektc.webdriver_task.locators.Locators.*;

import org.openqa.selenium.WebDriver;

public final class HomePage extends BasePage {

    private static final HomePage HOME_PAGE = new HomePage();

    public static HomePage getHomePage(WebDriver driver) {
        BasePage.driver = driver;
        return HOME_PAGE;
    }

    public SearchResultPage doSearchFor(String searchTerm) {
        driver.findElement(SEARCH_FIELD).clear();
        driver.findElement(SEARCH_FIELD).sendKeys(searchTerm);
        return SearchResultPage.getSearchResultPage(driver);
    }
}
