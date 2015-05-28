package iilntc.webdrivertask;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

/**
 * Created by true on 28.05.2015.
 */
public class HomePage {

    private WebDriver driver;
    private JavascriptExecutor js;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public Boolean hideAndVerifyGoogleLogo() throws NullPointerException {
        driver.findElement(By.id("hplogo"));
        js = (JavascriptExecutor) driver;
        js.executeScript("return document.getElementById('hplogo').style.visibility = 'hidden';");
        return driver.findElement(By.cssSelector("div[id='hplogo']")).isDisplayed();
    }

    public ResultPage search(String text) {
        driver.findElement(By.id("lst-ib")).sendKeys(text);
        return new ResultPage(driver);
    }

}
