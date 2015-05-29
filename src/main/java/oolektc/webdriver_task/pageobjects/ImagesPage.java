package oolektc.webdriver_task.pageobjects;

import org.openqa.selenium.WebDriver;

import static oolektc.webdriver_task.locators.Locators.*;

public final class ImagesPage extends BasePage {

    public ImagesPage(WebDriver driver) {
        super(driver);
    }

    public final HomePage clickOnGoogleLogo() {
        driver.findElement(HEADER_GOOGLE_LOGO).click();
        return new HomePage(driver);
    }
}
