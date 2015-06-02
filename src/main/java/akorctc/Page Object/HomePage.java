//TODO fix package problem
package akorctc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends Base {

    public HomePage(WebDriver driver) {
        super(driver);
    }


    //TODO move out locators
    public void fillInputField (String str){
        driver.findElement(By.id("lst-ib")).sendKeys(str);

    }
    public SearchResultPage clickSearchButton(){
        driver.findElement(By.xpath(".//*[@id='sblsbb']/button")).click();
        return new SearchResultPage(driver);
    }
}
