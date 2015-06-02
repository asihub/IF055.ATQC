package iilntc.webdrivertask.pageobjectpages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;

/**
 * Created by true on 29.05.2015.
 */

public class PageObjectPage {

    protected WebDriver driver;

    public PageObjectPage(WebDriver driver) {
        this.driver = driver;
    }

    public void executeScript(String script) {
        ((JavascriptExecutor) driver).executeScript(script);
    }

    public void executeScript(String script, WebElement element) {
        ((JavascriptExecutor) driver).executeScript(script, element);
    }

    public Boolean verifyIsElementDisplayed(By by) {
        return driver.findElement(by).isDisplayed();
    }

    public void takeScreenshot(String fileName) throws IOException {
        FileUtils.copyFile(((TakesScreenshot) driver)
                .getScreenshotAs(OutputType.FILE), new File("src/main/resources/" + fileName));
    }

}


