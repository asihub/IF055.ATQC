package idyntc.page_object_task;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static idyntc.page_object_task.Locators.*;

/**
 * Created by Ihor-Dynka on 28.05.2015.
 */
public class ResultPage extends PageObjectPage{

    public ResultPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getFirstLink() {
        return driver.findElement(FUNNY_PICTURE_LINK_LOCATOR);
    }

    public ImagesPage clickImagesTab() {
        driver.findElement(GOOGLE_IMAGES_LOCATOR).click();
        return new ImagesPage(driver);
    }
    //TODO make method versatile, use locator as a parameter
    public void changeElementsColor(WebElement element, String color) {
       ((JavascriptExecutor) driver).executeScript("arguments[0].style.color=" + color, element);

    }
}
