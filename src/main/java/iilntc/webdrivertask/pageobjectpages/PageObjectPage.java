package iilntc.webdrivertask.pageobjectpages;

import iilntc.webdrivertask.shortcutspackage.Shortcuts;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;

/**
 * Created by true on 29.05.2015.
 */

public class PageObjectPage extends Shortcuts {

    protected WebDriver driver;
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

    //TODO rename, one method - one action
    public void takeScreenshot() throws IOException {
        //TODO screenshot must be placed to /src/main/resources
        FileUtils.copyFile(((TakesScreenshot) driver)
                .getScreenshotAs(OutputType.FILE), new File(FILE_PLACE));
    }

}


