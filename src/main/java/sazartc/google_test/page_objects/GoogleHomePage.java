package sazartc.google_test.page_objects;

import org.openqa.selenium.*;

/**
 * Created by i07016 on 28.05.2015.
 */
public class GoogleHomePage extends PageObjectBase {

    private WebElement searchInput;
    private WebElement logo;

    public GoogleHomePage(WebDriver driver) {
        super(driver);
    }

    public boolean setLogoUnvisibleAndCheck() {
        logo = driver.findElement(By.xpath(".//*[@id='logo']/img"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].style.visibility='hidden'", logo);
        return logo.isDisplayed();
    }

    public SearchResultsPage searchExecute(String searchText) {
        searchInput = driver.findElement(By.name("q"));
        searchInput.sendKeys(searchText);
        searchInput.sendKeys(Keys.RETURN);
        return new SearchResultsPage(driver);
    }
}
