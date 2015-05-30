package iilntc.webdrivertask.pageobjectpages;

import org.openqa.selenium.WebDriver;

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

    public PicturesPage getPicturesPage() {
        driver.findElement(IMAGES_BUTTON).click();
        return new PicturesPage(driver);
    }

}
