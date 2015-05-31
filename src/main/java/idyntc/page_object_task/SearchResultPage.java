/*
* Copyright (C) 2015 PageObjectTask Project by Ihor Dynka
 */

package idyntc.page_object_task;

import org.openqa.selenium.WebDriver;

import static idyntc.page_object_task.Locators.IMAGES_TAB;

/**
 * Created by Ihor-Dynka on 28.05.2015.
 */

/**
 * result page after searching something
 */
public class SearchResultPage extends PageObjectPage {

    public SearchResultPage(WebDriver driver) {
        super(driver);
    }

    /**
     * clicks on tab "Images" for getting all searching images
     *
     * @return new page of images
     */
    public ImagesPage clickImagesTab() {
        driver.findElement(IMAGES_TAB).click();
        return new ImagesPage(driver);
    }


}
