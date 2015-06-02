package iilntc.webdrivertask.pageobjectpages;

import org.openqa.selenium.WebDriver;

import static iilntc.webdrivertask.shortcutspackage.Shortcuts.FIRST_LINK;
import static iilntc.webdrivertask.shortcutspackage.Shortcuts.IMAGES_BUTTON;

/**
 * Created by true on 28.05.2015.
 */
public class ResultPage extends BasePage {

    public ResultPage(WebDriver driver) {
        super(driver);
    }

    public String getFirstLinkText() {
        return driver.findElement(FIRST_LINK).getText().toLowerCase();
    }
    //TODO rename to represent actions - clickImageButton();
    public PicturesPage getPicturesPage() {
        driver.findElement(IMAGES_BUTTON).click();
        return new PicturesPage(driver);
    }

}
