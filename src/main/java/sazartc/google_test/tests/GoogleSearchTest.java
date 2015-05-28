package sazartc.google_test.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import sazartc.google_test.page_objects.GoogleHomePage;
import sazartc.google_test.page_objects.SearchResultsPage;
import sazartc.google_test.page_objects.SearchedPicturesPage;

/*
* Google Search Test
*/

public class GoogleSearchTest extends GoogleTestsWrapper {

    private final String GOOGLE_HOME_URL = "http://google.com.ua";

    @Test
    public void testGoogleSearch() throws Exception {

        driver.get(GOOGLE_HOME_URL);

        GoogleHomePage googleHomePage = new GoogleHomePage(driver);

        // Search "funny picture" and check results
        SearchResultsPage searchResultsPage = googleHomePage.searchExecute("funny picture");
        log.info("searchResultsPage.checkFirstLinkContainsText: "
                + searchResultsPage.checkFirstLinkContainsText("funny picture"));

        // Check count od pictures and do screenshot
        SearchedPicturesPage searchedPicturesPage = searchResultsPage.pictureButtonClick();
        Assert.assertTrue(searchedPicturesPage.checkPicturesCountIsNotLessThan(5));
        searchedPicturesPage.doScreenShot();

        // Hide logo at home page
        googleHomePage = searchedPicturesPage.getGoogleHomePage();
        log.info("googleHomePage.setLogoUnvisibleAndCheck(): " + googleHomePage.setLogoUnvisibleAndCheck());

        // Search "funny picture" and check results
        searchResultsPage = googleHomePage.searchExecute("funny kitten picture");
        log.info("searchResultsPage.checkFirstLinkContainsText: "
                + searchResultsPage.checkFirstLinkContainsText("funny kitten picture"));
        // Change first link's color
        log.info("searchResultsPage.setFirstLinkColorAndCheck(\"magenta\"): "
                + searchResultsPage.setFirstLinkColorAndCheck("magenta"));
    }
}
