/*
* Copyright (C) 2015 PageObjectTask Project by Ihor Dynka
 */

package idyntc.page_object_task;

import org.openqa.selenium.*;

import static idyntc.page_object_task.Locators.GOOGLE_SEARCH;

/**
 * Created by Ihor-Dynka on 28.05.2015.
 */

/**
 * searches in Google home page and open search result page,
 * hides google logo
 */
public class HomePage extends PageObjectPage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    /**
     * searches something
     *
     * @param searchTerm - some information which you'd like to find
     * @return page with searching result
     */
    public SearchResultPage doSearch(String searchTerm) {
        driver.findElement(GOOGLE_SEARCH).sendKeys(searchTerm);

        return new SearchResultPage(driver);
    }

    /**
     * hides web elements from page
     *
     * @param element
     */
    public void hideElement(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].style.visibility='hidden'",
                element);
    }


}
