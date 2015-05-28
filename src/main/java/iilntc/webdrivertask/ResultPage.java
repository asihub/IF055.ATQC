package iilntc.webdrivertask;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

/**
 * Created by true on 28.05.2015.
 */
public class ResultPage {
    private WebDriver driver;
    private JavascriptExecutor js;

    public ResultPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getFirstLink() {
        return driver.findElement(By.xpath("//li[1]/div[@class='rc']/h3/a")).getText().toLowerCase();
    }

    public PicturesPage getPicturesPage() {
        //(new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='hdtb-msb']/div[2]/a")));
        driver.findElement(By.xpath("//*[@id='hdtb-msb']/div[2]/a")).click();
        return new PicturesPage(driver);
    }

    public Boolean changeFirstLinkColourAndVerifyIt(){
            js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.color = 'red'",
                driver.findElement(By.xpath("//li[1]/div[@class='rc']/h3/a")));
        return driver.findElement(By.xpath("//li[1]/div[@class='rc']/h3/a[@style = 'color: red;']")).isDisplayed();
    }
}
