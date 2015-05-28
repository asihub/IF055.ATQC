package idyntc.page_object_task;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static idyntc.webdriver_task.Locators.*;

/**
 * Created by Ihor-Dynka on 28.05.2015.
 */
public class HomePage extends PageObjectPage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public ResultPage search(String someText){
        driver.findElement(By.name(GOOGLE_SEARCH_LOCATOR)).sendKeys(someText);
        return new ResultPage(driver);
    }

    public WebElement getGoogleLogo() {
        return driver.findElement(By.cssSelector(GOOGLE_LOGO_LOCATOR));
    }

    public void hideLogo() {
        ((JavascriptExecutor) driver).executeScript(HIDE_GOOGLE_LOGO_SCRIPT);
    }


}
