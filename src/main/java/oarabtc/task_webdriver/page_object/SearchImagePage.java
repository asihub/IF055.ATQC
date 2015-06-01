package oarabtc.task_webdriver.page_object;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

import static oarabtc.task_webdriver.Locators.GOOGLE_LOGO;

public class SearchImagePage extends PageObjectPage {
    public SearchImagePage(WebDriver driver) {
        super(driver);
    }

    public void takeScreenshot() throws IOException {
        FileUtils.copyFile(((TakesScreenshot) driver)
                .getScreenshotAs(OutputType.FILE), new File("src//main//resources/screenshot.png"));
    }
    public HomePage clickGoogleLogo() {
        driver.findElement(GOOGLE_LOGO).click();
        return new HomePage(driver);
    }
}
