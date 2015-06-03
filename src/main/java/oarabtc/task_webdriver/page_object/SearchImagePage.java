package oarabtc.task_webdriver.page_object;

import org.openqa.selenium.WebDriver;

import static oarabtc.task_webdriver.Locators.GOOGLE_LOGO;

public class SearchImagePage extends PageObjectPage {
    public SearchImagePage(WebDriver driver) {
        super(driver);
    }

    public HomePage clickGoogleLogo() {
        driver.findElement(GOOGLE_LOGO).click();
        return new HomePage(driver);
    }
}
