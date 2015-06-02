package sazartc.google_test.tests;

import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.Test;
import sazartc.google_test.page_objects.GoogleHomePage;
import sazartc.google_test.page_objects.SearchResultsPage;
import sazartc.google_test.page_objects.SearchedPicturesPage;

/*
* Google Search Test
*/

public class GoogleSearchTest extends GoogleTestsRunner {

    private final String GOOGLE_HOME_URL = "http://google.com.ua";
    private final int MINIMAL_PICTURES_COUNT = 5;
    private final String SCREENSHOT_FULL_FILENAME = "src\\main\\resources\\sazartc\\screenshot.png";
    private final String FIRST_LINK_COLOR = "magenta";

    private final String[] SEARCHED_TEXT_ARRAY = {
            "funny picture",
            "funny kitten picture"
    };

    @Test
    public void testGoogleSearch() throws Exception {

        driver.get(GOOGLE_HOME_URL);
        GoogleHomePage googleHomePage = new GoogleHomePage(driver);

        // Search and check results
        SearchResultsPage searchResultsPage = googleHomePage.searchFor(SEARCHED_TEXT_ARRAY[0]);
        if (!searchResultsPage.getFirstLinkText().contains(SEARCHED_TEXT_ARRAY[0])) {
            log.warn("First link in search result doen't contain text: " + SEARCHED_TEXT_ARRAY[0]);
        }

        // Check count of pictures and do screenshot
        SearchedPicturesPage searchedPicturesPage = searchResultsPage.clickPictureButton();
        Assert.assertTrue(searchedPicturesPage.getPicturesCount() >= MINIMAL_PICTURES_COUNT);
        searchedPicturesPage.doScreenShot(SCREENSHOT_FULL_FILENAME);

        // Hide logo at home page
        googleHomePage = searchedPicturesPage.clickHeaderLogo();
        googleHomePage.setLogoNotVisible();
        Assert.assertFalse(googleHomePage.isLogoDisplayed());

        // Search and check results
        searchResultsPage = googleHomePage.searchFor(SEARCHED_TEXT_ARRAY[1]);
        if (!searchResultsPage.getFirstLinkText().contains(SEARCHED_TEXT_ARRAY[1])) {
            log.warn("First link in search result doen't contain text: " + SEARCHED_TEXT_ARRAY[1]);
        }

        // Change first link's color and check
        searchResultsPage.setFirstLinkColor(FIRST_LINK_COLOR);
        Assert.assertEquals(Color.fromString(FIRST_LINK_COLOR),
                Color.fromString(searchResultsPage.getFirstLinkColor()));
    }
}
