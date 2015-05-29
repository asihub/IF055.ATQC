package oolektc.webdriver_task.pageobjects;

import org.openqa.selenium.WebDriver;

import static oolektc.webdriver_task.locators.Locators.*;

public final class SearchResultPage extends BasePage {

    public SearchResultPage(WebDriver driver) {
        super(driver);
    }

    public final ImagesPage clickImagesTab() {
        driver.findElement(IMAGES_TAB).click();
        return new ImagesPage(driver);
    }
}
