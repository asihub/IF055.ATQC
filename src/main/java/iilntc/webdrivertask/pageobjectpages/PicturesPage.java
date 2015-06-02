package iilntc.webdrivertask.pageobjectpages;

import org.openqa.selenium.WebDriver;

import static iilntc.webdrivertask.locators_and_scripts.Locators.IMAGES_LINKS;

/**
 * Created by true on 28.05.2015.
 */
public class PicturesPage extends BasePage {

    public PicturesPage(WebDriver driver) {
        super(driver);
    }

    public Integer getQuantityOfPictures() {
        return driver.findElements(IMAGES_LINKS).size();
    }

}


