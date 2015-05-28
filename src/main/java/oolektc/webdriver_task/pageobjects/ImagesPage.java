package oolektc.webdriver_task.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public final class ImagesPage extends BasePage {

    public ImagesPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Returns a list of first n images from images page
     *
     * @param numberOfImages number of image elements to be added to the list
     */
    public List<WebElement> getListOfImages(int numberOfImages) {
        return driver
                .findElements
                        (By.xpath("(.//*[@id='rg_s']//img)[position() >=1 and position() <=" + numberOfImages + "]"));
    }
}
