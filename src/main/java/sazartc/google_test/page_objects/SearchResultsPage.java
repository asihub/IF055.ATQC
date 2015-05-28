package sazartc.google_test.page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;

/**
 * Created by i07016 on 28.05.2015.
 */
public class SearchResultsPage extends PageObjectBase{
    private WebElement firstLink;

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    public boolean checkFirstLinkContainsText(String searchText) {
        firstLink = driver.findElement(By.xpath(".//*[@id='rso']/div[2]/li[1]/div/h3/a"));
        return (firstLink.getText().contains("funny picture"));
    }

    public SearchResultsPage pictureButtonClick() {
        driver.findElement(By.xpath(".//*[@id='hdtb-msb']/div[2]/a")).click();
        return new SearchResultsPage(driver);
    }

    public boolean setFirstLinkColorAndCheck(Color color) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].style.color='red'", firstLink);
        return color.toString().equals(Color.fromString(firstLink.getCssValue("color")));
    }

}
