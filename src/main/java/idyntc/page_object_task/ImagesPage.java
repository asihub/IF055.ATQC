package idyntc.page_object_task;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;
import java.util.List;

import static idyntc.page_object_task.Locators.SMALL_GOOGLE_LOGO;
import static idyntc.page_object_task.Locators.FUNNY_PICTURES_LOCATOR;

/**
 * Created by Ihor-Dynka on 28.05.2015.
 */
public class ImagePage extends PageObjectPage{

    public ImagePage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getImagesList() {
        return driver.findElements(FUNNY_PICTURES_LOCATOR);
    }

    public HomePage clickGoogleLogo() {
        driver.findElement(SMALL_GOOGLE_LOGO).click();
        return new HomePage(driver);
    }
}
