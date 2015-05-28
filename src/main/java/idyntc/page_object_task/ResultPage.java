package idyntc.page_object_task;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static idyntc.webdriver_task.Locators.*;

/**
 * Created by Ihor-Dynka on 28.05.2015.
 */
public class ResultPage extends PageObjectPage{

    public ResultPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getFirstLink() {
        return driver.findElement(By.cssSelector(FUNNY_PICTURE_LINK_LOCATOR));
    }

    public ImagePage goToImages() {
        driver.findElement(By.xpath(GOOGLE_IMAGES_LOCATOR)).click();
        return new ImagePage(driver);
    }

    public void changeColorLink() {
        ((JavascriptExecutor) driver).executeScript(CHANGE_LINK_COLOR_SCRIPT);

    }
}
