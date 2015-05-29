package oolektc.webdriver_task.pageobjects;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;

public class BasePage {
    //TODO move to the test class/method or somewhere else
    public static final String URL = "https://www.google.com/";
    //TODO avoid using static webdriver
    protected static WebDriver driver;

    public BasePage() {
    }

    public BasePage(WebDriver driver) {
        BasePage.driver = driver;
    }
    //TODO screenshot must be placed to /src/main/resources
    public final void takeScreenshot(String path, String fileName) {
        try {
            final File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File(path + fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public final HomePage navigateToHomePage() {
        //TODO this is a pre setup action, move out
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
