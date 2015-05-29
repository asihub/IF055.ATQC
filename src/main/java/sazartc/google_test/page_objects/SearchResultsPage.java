package sazartc.google_test.page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;

/*
 * PageObject class for Google Search Results
 */
public class SearchResultsPage extends PageObjectBase{
    private WebElement firstLink;

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }
    //TODO assertions only in test classes, in test methods
    public boolean checkFirstLinkContainsText(String searchText) {
        firstLink = driver.findElement(By.xpath(properties.getProperty("FIRST_LINK")));
        return (firstLink.getText().contains("funny picture"));
    }
    //TODO clickPictureButton();
    public SearchedPicturesPage pictureButtonClick() {
        driver.findElement(By.xpath(properties.getProperty("PICTURE_BUTTON"))).click();
        return new SearchedPicturesPage(driver);
    }

    //TODO assertions only in test classes, in test methods
    public boolean setFirstLinkColorAndCheck(String color) {
        ((JavascriptExecutor) driver).executeScript(String.format("arguments[0].style.color='%s'", color), firstLink);
        return Color.fromString(color).equals(Color.fromString(firstLink.getCssValue("color")));
    }

}
