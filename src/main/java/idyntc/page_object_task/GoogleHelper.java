/*
* Copyright (C) 2015 PageObjectTask Project by Ihor Dynka
 */

package idyntc.page_object_task;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;

/**
 * Created by Ihor-Dynka on 31.05.2015.
 */

/**
 * contains some general methods
 */
public class GoogleHelper extends PageObjectPage {
    public GoogleHelper(WebDriver driver) {
        super(driver);
    }

    /**
     * get web element from page
     *
     * @param element
     * @return
     */
    public WebElement getWebElement(By element) {
        return driver.findElement(element);
    }

    /**
     * method does screenshot of page
     *
     * @param screenShotFileName - name of file and path of file
     */
    public void doScreenShots(String screenShotFileName) {
        try {
            File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(sourceFile, new File("src/main/resources/" + screenShotFileName));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * changes attribute color of web element
     *
     * @param element
     * @param color
     */
    public void changeElementsColor(WebElement element, String color) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].style.color=" + color, element);
    }

}
