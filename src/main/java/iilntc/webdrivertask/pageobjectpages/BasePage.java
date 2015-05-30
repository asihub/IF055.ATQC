package iilntc.webdrivertask.pageobjectpages;

import org.openqa.selenium.WebDriver;

/**
 * Created by true on 29.05.2015.
 */

public class BasePage extends PageObjectPage {

    public BasePage(WebDriver driver) {
        super(driver);
    }

    public HomePage backToGoogleHomePage() {
        driver.findElement(BACK_LINK).click();
        return new HomePage(driver);
    }

}


