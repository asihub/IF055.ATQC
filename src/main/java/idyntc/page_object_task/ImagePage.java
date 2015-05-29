package idyntc.page_object_task;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;
import java.util.List;

import static idyntc.webdriver_task.Locators.BACK_TO_HOME_PAGE_LOGO_LOCATOR;
import static idyntc.webdriver_task.Locators.FUNNY_PICTURES_LOCATOR;
import static idyntc.webdriver_task.Locators.SCREENSHOT_FILE_PATH;

/**
 * Created by Ihor-Dynka on 28.05.2015.
 */
public class ImagePage extends PageObjectPage{

    public ImagePage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getImagesList() {
        return driver.findElements(By.cssSelector(FUNNY_PICTURES_LOCATOR));
    }
    ///TODO make methods versatile, use file name as a parameter
    public void doScreenShots (){
        try {
            File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(sourceFile, new File(SCREENSHOT_FILE_PATH));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //TODO code convention, rename to clickGoogleLogo() or something
    public HomePage ComeBackToHomePage() {
        driver.findElement(By.cssSelector(BACK_TO_HOME_PAGE_LOGO_LOCATOR)).click();
        return new HomePage(driver);
    }
}
