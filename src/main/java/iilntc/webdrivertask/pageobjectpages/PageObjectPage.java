package iilntc.webdrivertask.pageobjectpages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;

import static iilntc.webdrivertask.shortcutspackage.Shortcuts.FILE_PLACE;

/**
 * Created by true on 29.05.2015.
 */

public class PageObjectPage {

    protected WebDriver driver;
    //TODO rename
    protected JavascriptExecutor js;

    public PageObjectPage(WebDriver driver) {
        this.driver = driver;
    }

    public void executeScript(String script) {
        js = (JavascriptExecutor) driver;
        js.executeScript(script);
    }

    public void executeScript(String script, WebElement element) {
        js = (JavascriptExecutor) driver;
        js.executeScript(script, element);
    }

    public Boolean verifyIsElementDisplayed(By by) {
        return driver.findElement(by).isDisplayed();
    }
    //TODO make versatile
    public void takeScreenshot() throws IOException {
        FileUtils.copyFile(((TakesScreenshot) driver)
                .getScreenshotAs(OutputType.FILE), new File(FILE_PLACE));
    }

}


