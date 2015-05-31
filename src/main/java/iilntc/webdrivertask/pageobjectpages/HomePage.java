package iilntc.webdrivertask.pageobjectpages;

import org.openqa.selenium.WebDriver;

import static iilntc.webdrivertask.shortcutspackage.Shortcuts.GOOGLE_SEARCH_FIELD;

/**
 * Created by true on 28.05.2015.
 */
public class HomePage extends PageObjectPage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public ResultPage search(String text) {
        driver.findElement(GOOGLE_SEARCH_FIELD).sendKeys(text);
        return new ResultPage(driver);
    }

}
