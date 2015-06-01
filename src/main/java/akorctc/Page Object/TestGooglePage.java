package akorctc;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.Assert;
import java.util.concurrent.TimeUnit;

public class TestGooglePage {

    static final String URL = "https://www.google.com/";
    WebDriver driver;

    @BeforeClass
    public void config() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get(URL);
    }

    @Test
    public void testPage() {

        // write in search window
        HomePage homePage = new HomePage(driver);
        homePage.fillInputField("funny picture");

        // button search
        SearchResultPage searchResultPage = homePage.clickSearchButton();

        //fixed
        Assert.assertTrue(searchResultPage.getFirstLink()
                .getText().contains("funny picture"));

        //button Images
        ImagesPage imagesPage;
        imagesPage = searchResultPage.clickImageLink();

        //verify five images
        for (WebElement element : imagesPage.getImagesList()) {
            Assert.assertTrue(element.isDisplayed());
        }

        // make a screenshot
        imagesPage.makeScreenshot();

        //beck on a head
        imagesPage.clickGoogleLogo();

        //verify that logo is displayed
        Assert.assertTrue(driver.findElement(By.id("hplogo")).isDisplayed());

        ((JavascriptExecutor) driver).executeScript("arguments[0].style.visibility='hidden'",
                driver.findElement(By.id("hplogo")));

        //verify that logo is displayed
        Assert.assertFalse(driver.findElement(By.id("hplogo")).isDisplayed());

        // write in searh window
        homePage = new HomePage(driver);
        homePage.fillInputField("funny kitten picture");

        // button search
        homePage.clickSearchButton();

        //verify the color
        ((JavascriptExecutor) driver).executeScript("arguments[0].style.color = 'rgb(52, 221, 221)'",
                driver.findElement(By.xpath("(.//*[@class='srg']//a)[1]")));
        Assert.assertTrue(driver.findElement(By.xpath("(.//*[@class='srg']//a)[1]"))
                .getAttribute("style").equals("color: rgb(52, 221, 221);"));

    }

    @AfterClass
    public void shutDown() {
        driver.quit();
    }

}



