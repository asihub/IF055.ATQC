package sazartc.google_test.page_objects;

import org.openqa.selenium.*;

/*
 * PageObject class for Google Home
 */
public class GoogleHomePage extends PageObjectBase {

    private WebElement searchInput;
    private WebElement logo;

    public GoogleHomePage(WebDriver driver) {
        super(driver);
    }

    public boolean setLogoUnvisibleAndCheck() {
        logo = driver.findElement(By.xpath(properties.getProperty("HOMEPAGE_LOGO")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].style.visibility='hidden'", logo);
        return logo.isDisplayed();
    }

    public SearchResultsPage searchExecute(String searchText) {
        searchInput = driver.findElement(By.name(properties.getProperty("SEARCH_INPUT")));
        searchInput.sendKeys(searchText);
        searchInput.sendKeys(Keys.RETURN);
        return new SearchResultsPage(driver);
    }
}
