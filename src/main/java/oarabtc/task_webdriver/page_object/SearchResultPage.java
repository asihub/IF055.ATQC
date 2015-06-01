package oarabtc.task_webdriver.page_object;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static oarabtc.task_webdriver.Locators.*;

public class SearchResultPage extends PageObjectPage {

    public SearchResultPage(WebDriver driver) {
        super(driver);
    }

    public SearchImagePage clickImageButton() {
        driver.findElement(IMAGES_BUTTON).click();
        return new SearchImagePage(driver);
    }

    public final void changeElementColor(WebElement element, String color) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].style.color =" + color, element);
    }
}
