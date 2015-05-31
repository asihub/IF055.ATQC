package sazartc.google_test.page_objects;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;
import java.util.List;

/*
 * PageObject class for Google Searched Pictures
 */
public class SearchedPicturesPage extends PageObjectBase {

    private List<WebElement> pictures;
    private WebElement headerLogo;

    public SearchedPicturesPage(WebDriver driver) {
        super(driver);
        pictures = driver.findElements(By.xpath(locators.getProperty("PICTURES")));
        headerLogo = driver.findElement(By.id(locators.getProperty("HEADER_LOGO")));
    }

    public int getPicturesCount() {
        return pictures.size();
    }

    public void doScreenShot(String screenShotFileName) throws IOException {
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File(screenShotFileName));
    }

    public GoogleHomePage clickHeaderLogo() {
        headerLogo.click();
        return new GoogleHomePage(driver);
    }
}
