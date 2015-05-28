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

    public SearchedPicturesPage pictureButtonClick() {
        driver.findElement(By.xpath(".//*[@id='hdtb-msb']/div[2]/a")).click();
        return new SearchedPicturesPage(driver);
    }

    public boolean setFirstLinkColorAndCheck(String color) {
        ((JavascriptExecutor) driver).executeScript(String.format("arguments[0].style.color='%s'", color), firstLink);
        return Color.fromString(color).equals(Color.fromString(firstLink.getCssValue("color")));
    }

}