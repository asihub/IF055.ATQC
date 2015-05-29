package oolektc.webdriver_task.pageobjects;

import org.openqa.selenium.WebDriver;

import static oolektc.webdriver_task.locators.Locators.IMAGES_TAB;

public final class SearchResultPage extends BasePage {
    //TODO overcomplication because of static webdriver
    private static final SearchResultPage SEARCH_RESULT_PAGE = new SearchResultPage();

    public static SearchResultPage getSearchResultPage(WebDriver driver) {
        BasePage.driver = driver;
        return SEARCH_RESULT_PAGE;
    }
    //TODO rename, clickBlaBla() ...
    public ImagesPage navigateToImagesPage() {
        driver.findElement(IMAGES_TAB).click();
        return new ImagesPage(driver);
    }
}
