package iilntc.webdrivertask;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;

/**
 * Created by true on 28.05.2015.
 */
public class PicturesPage {
    private WebDriver driver;

    public PicturesPage(WebDriver driver){
        this.driver = driver;
    }
    //TODO rename, one method - one action
    public Integer picturesPageSize() throws IOException {
        //TODO screenshot must be placed to /src/main/resources
        FileUtils.copyFile(((TakesScreenshot) driver)
                .getScreenshotAs(OutputType.FILE), new File("c:\\screenshoot.png"));
        return driver.findElements(By.cssSelector("img")).size();
    }
}


