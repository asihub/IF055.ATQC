package sazartc.google_test;

import org.testng.annotations.Test;
import sazartc.google_test.page_objects.GoogleHomePage;

/**
 * Created by i07016 on 28.05.2015.
 */
public class GoogleTestsExecutor extends GoogleTestsWrapper {

    private final String GOOGLE_HOME_URL = "http://google.com.ua";

    @Test
    public void testUntitled() throws Exception {

        driver.get(GOOGLE_HOME_URL);

        GoogleHomePage googleHomePage = new GoogleHomePage(driver);
        googleHomePage.searchExecute("funny picture");


    }
}
