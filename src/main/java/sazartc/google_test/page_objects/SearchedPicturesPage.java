package sazartc.google_test.page_objects;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Created by i07016 on 28.05.2015.
 */
public class SearchedPicturesPage extends PageObjectBase {

    private List<WebElement> pictures;

    public SearchedPicturesPage(WebDriver driver) {
        super(driver);
    }

    public boolean checkPicturesCountIsNotLessThan(int minimalPicturesCount) {
        pictures = driver.findElements(By.xpath(".//*[@id='rg_s']/div[@class='rg_di rg_el']/a/img"));
        return (pictures.size() >= minimalPicturesCount);
    }

    public void doScreenShot() throws IOException {
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("screenshot.png"));
    }

    public GoogleHomePage getGoogleHomePage() {
        driver.findElement(By.id("logo")).click();
        return new GoogleHomePage(driver);
    }
}
