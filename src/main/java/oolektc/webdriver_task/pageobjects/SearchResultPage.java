package oolektc.webdriver_task.pageobjects;

import oolektc.webdriver_task.locators.Locators;
import org.openqa.selenium.WebDriver;

public final class SearchResultPage extends BasePage {

    public static final SearchResultPage SEARCH_RESULT_PAGE = new SearchResultPage(driver);

    private SearchResultPage(WebDriver driver) {
        super(driver);
    }

    public static SearchResultPage getSearchResultPage(WebDriver driver) {
        BasePage.driver = driver;
        return SEARCH_RESULT_PAGE;
    }

    public ImagesPage navigateToImagesPage() {
        driver.findElement(Locators.IMAGES_TAB).click();
        return new ImagesPage(driver);
    }
}
