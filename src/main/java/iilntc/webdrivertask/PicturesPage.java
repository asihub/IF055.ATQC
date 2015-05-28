package iilntc.webdrivertask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by true on 28.05.2015.
 */
public class PicturesPage {
    private WebDriver driver;

    public PicturesPage(WebDriver driver){
        this.driver = driver;
    }

    public Integer picturesPageSize(){
        return driver.findElements(By.cssSelector("img")).size();
    }
}


