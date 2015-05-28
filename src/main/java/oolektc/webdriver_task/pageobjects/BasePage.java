package oolektc.webdriver_task.pageobjects;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;

public class BasePage {

    public static final String URL = "https://www.google.com/";
    protected static WebDriver driver;

    public BasePage() {
    }

    public BasePage(WebDriver driver) {
        BasePage.driver = driver;
    }

    public final void takeScreenshot(String path, String fileName) {
        try {
            final File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File(path + fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public final HomePage navigateToHomePage() {
        driver.get(URL);
        return HomePage.getHomePage(driver);
    }

    public final void hideElement(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].style.visibility='hidden'",
                element);
    }

    public final void changeElementColor(WebElement element, String color) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].style.color =" + color, element);
    }
}
