package sazartc.google_test.page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;

/*
 * PageObject class for Google Search Results
 */
public class SearchResultsPage extends PageObjectBase {

    private WebElement firstLink;
    private WebElement pictureButton;

    public SearchResultsPage(WebDriver driver) {
        super(driver);
        firstLink = driver.findElement(By.xpath(properties.getProperty("FIRST_LINK")));
        pictureButton = driver.findElement(By.xpath(properties.getProperty("PICTURE_BUTTON")));
    }

    public String getFirstLinkText() {
        return firstLink.getText();
    }

    public SearchedPicturesPage clickPictureButton() {
        pictureButton.click();
        return new SearchedPicturesPage(driver);
    }

    public void setFirstLinkColor(String color) {
        ((JavascriptExecutor) driver).executeScript(String.format("arguments[0].style.color='%s'", color), firstLink);
    }

    public String getFirstLinkColor() {
        return firstLink.getCssValue("color");
    }

}
