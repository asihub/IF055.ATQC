package akorctc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ImagesPage extends Base {
    public ImagesPage(WebDriver driver) {
        super(driver);
    }
    public List<WebElement> getImagesList() {
        List<WebElement> listOfImages =
                driver.findElements(By.xpath("(.//*[@id='rg_s']//img)[position() >=1 and position() <=5]"));
        return listOfImages;
    }
    public HomePage clickGoogleLogo(){
        driver.findElement(By.xpath(".//*[@id='logocont']/a/img")).click();
        return new HomePage(driver);
    }
}
