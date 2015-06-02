package akorctc;
//TODO fix package problem
//TODO move out locators
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResultPage extends Base  {
    public SearchResultPage(WebDriver driver) {
        super(driver);
    }
    public WebElement getFirstLink(){
       return driver.findElement(By.cssSelector(".r>a"));
    }
    public ImagesPage clickImageLink(){
        driver.findElement(By.xpath(".//*[@id='hdtb-msb']/div[2]/a")).click();
        return new ImagesPage(driver);
    }}
