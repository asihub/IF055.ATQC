package oarabtc.task_webdriver.page_object;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static oarabtc.task_webdriver.Locators.*;

import java.io.IOException;

public class HomePage extends PageObjectPage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public SearchResultPage searchFor(String searchText) throws IOException {
        driver.findElement(GOOGLE_SEARCH_FIELD).sendKeys(searchText);
        driver.findElement(GOOGLE_SEARCH_FIELD).sendKeys(Keys.ENTER);
        return new SearchResultPage(driver);
    }

    public void hideElement(WebElement element) {
        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].style.visibility='hidden'", element);
    }
}
