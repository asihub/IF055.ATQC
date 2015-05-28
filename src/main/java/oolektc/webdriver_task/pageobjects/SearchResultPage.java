package oolektc.webdriver_task.pageobjects;

import static oolektc.webdriver_task.locators.Locators.*;

import org.openqa.selenium.WebDriver;

public final class SearchResultPage extends BasePage {

    private static final SearchResultPage SEARCH_RESULT_PAGE = new SearchResultPage();

    public static SearchResultPage getSearchResultPage(WebDriver driver) {
        BasePage.driver = driver;
        return SEARCH_RESULT_PAGE;
    }

    public ImagesPage navigateToImagesPage() {
        driver.findElement(IMAGES_TAB).click();
        return new ImagesPage(driver);
    }
}
