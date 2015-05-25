package idyntc;

/**
 * Created by Ihor Dynka on 08.05.2015.
 */
public interface Locators {
    public static final String SCREENSHOT_FILE_PATH = "src\\main\\java\\screenshots\\Screenshot.png";

    public static final String GOOGLE_URL = "http://www.google.com";
    public static final String GOOGLE_SEARCH_LOCATOR = "q";
    public static final String FUNNY_PICTURE_LINK_LOCATOR = ".r>a";
    public static final String GOOGLE_IMAGES_LOCATOR = ".//*[@id='hdtb-msb']/div[2]/a";
    public static final String FUNNY_PICTURES_LOCATOR = ".rg_i";
    public static final String GOOGLE_LOGO_LOCATOR = "#hplogo";
    public static final String BACK_TO_HOME_PAGE_LOGO_LOCATOR = "#logo";

    public static final String HIDE_GOOGLE_LOGO_SCRIPT = "return document.getElementById('hplogo').style.display = 'none';";
    public static final String CHANGE_LINK_COLOR_SCRIPT = "return document.querySelector('.r>a').style.color = 'red';";
}
