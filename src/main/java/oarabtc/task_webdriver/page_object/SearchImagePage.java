package oarabtc.task_webdriver.page_object;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;
import java.util.List;

import static oarabtc.task_webdriver.Locators.*;

public class SearchImagePage extends PageObjectPage {
    public SearchImagePage(WebDriver driver) {
        super(driver);
    }
    //TODO make versatile
    public void takeScreenshot() throws IOException {
        FileUtils.copyFile(((TakesScreenshot) driver)
                .getScreenshotAs(OutputType.FILE), new File("src//main//resources/screenshot.png"));
    }
    public HomePage clickGoogleLogo() {
        driver.findElement(GOOGLE_LOGO).click();
        return new HomePage(driver);
    }

    public final List<WebElement> getListOfElements(By element) {
        return driver.findElements(element);
    }
}
