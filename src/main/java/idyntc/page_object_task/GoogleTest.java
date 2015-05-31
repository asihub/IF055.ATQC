/*
* Copyright (C) 2015 PageObjectTask Project by Ihor Dynka
 */

package idyntc.page_object_task;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static idyntc.page_object_task.Locators.GOOGLE_LOGO;
import static idyntc.page_object_task.Locators.FUNNY_PICTURE_FIRST_LINK;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

/**
 * Created by Ihor-Dynka on 28.05.2015.
 */
public class GoogleTest extends TestRunner {
    private final static String GOOGLE_URL = "http://www.google.com";

    @Test
    public void testGoogleSearch() {
        driver.get(GOOGLE_URL);
        HomePage homePage = new HomePage(driver);
        GoogleHelper googleHelper = new GoogleHelper(driver);

        SearchResultPage resultPage = homePage.doSearch("funny picture");
        assertTrue(googleHelper
                        .getWebElement(FUNNY_PICTURE_FIRST_LINK)
                        .getText()
                        .toLowerCase()
                        .contains("funny picture"),
                "there is no such text in this link");

        ImagesPage imagePage = resultPage.clickImagesTab();
        List<WebElement> imagesList = imagePage.getImagesList();
        assertTrue(imagesList.size() >= 5);

        googleHelper.doScreenShots("screenshot.png");
        imagePage.clickGoogleLogo();
        assertTrue(googleHelper.getWebElement(GOOGLE_LOGO).isDisplayed());

        homePage.hideElement(googleHelper.getWebElement(GOOGLE_LOGO));
        assertFalse(googleHelper.getWebElement(GOOGLE_LOGO).isDisplayed());

        homePage.doSearch("funny kitten picture");
        assertTrue(googleHelper
                .getWebElement(FUNNY_PICTURE_FIRST_LINK)
                .getText()
                .toLowerCase()
                .contains("funny kitten picture"), "there is no such text in this link");

        googleHelper.changeElementsColor(googleHelper.getWebElement(FUNNY_PICTURE_FIRST_LINK), "'red'");
        assertTrue(googleHelper.getWebElement(FUNNY_PICTURE_FIRST_LINK).getAttribute("style").equals("color: red;"));


    }
}
