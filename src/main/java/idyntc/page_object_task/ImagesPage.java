/*
* Copyright (C) 2015 PageObjectTask Project by Ihor Dynka
 */

package idyntc.page_object_task;

import org.openqa.selenium.*;

import java.util.List;

import static idyntc.page_object_task.Locators.SMALL_GOOGLE_LOGO;
import static idyntc.page_object_task.Locators.SEARCH_RESULT_IMAGES;

/**
 * Created by Ihor-Dynka on 28.05.2015.
 */

/**
 * page of images which appears after searching something
 * and clicking on images tab
 */
public class ImagesPage extends PageObjectPage {

    public ImagesPage(WebDriver driver) {
        super(driver);
    }

    /**
     * get list of images which we have found
     *
     * @return images list
     */
    public List<WebElement> getImagesList() {
        return driver.findElements(SEARCH_RESULT_IMAGES);
    }

    /**
     * clicks on small google logo for returning to home google page
     *
     * @return google home page
     */
    public HomePage clickGoogleLogo() {
        driver.findElement(SMALL_GOOGLE_LOGO).click();
        return new HomePage(driver);
    }
}
