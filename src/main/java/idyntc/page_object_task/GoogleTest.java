package idyntc.page_object_task;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

/**
 * Created by Ihor-Dynka on 28.05.2015.
 */
public class GoogleTest extends TestRunner{
    List<WebElement> imagesList;
    @Test
    public void testSearchImages(){
        HomePage googleHomePage = new HomePage(driver);
        ResultPage resultPage = googleHomePage.search("funny picture");
        assertTrue(resultPage
                .getFirstLink()
                .getText()
                .toLowerCase()
                .contains("funny picture"));

        ImagePage imagePage = resultPage.goToImages();
        imagesList = imagePage.getImagesList();

        if (imagesList.size()>=5) {
            imagePage.doScreenShots();
        }
        imagePage.ComeBackToHomePage();
    }

    @Test
    public void testHideGoogleLogo(){
        HomePage googleHomePage = new HomePage(driver);
        assertTrue(googleHomePage.getGoogleLogo().isDisplayed());
        googleHomePage.hideLogo();
        assertFalse(googleHomePage.getGoogleLogo().isDisplayed());

    }
    
    @Test
    public void testSearchKittenImages(){
        HomePage googleHomePage = new HomePage(driver);
        ResultPage resultPage = googleHomePage.search("funny kitten picture");
        assertTrue(resultPage
                .getFirstLink()
                .getText()
                .toLowerCase()
                .contains("funny kitten picture"));

        resultPage.getFirstLink();
        resultPage.changeColorLink();
    }
}
