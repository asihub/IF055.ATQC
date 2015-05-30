package iilntc.webdrivertask.shortcutspackage;

import org.openqa.selenium.By;

/**
 * Created by true on 30.05.2015.
 */
public class Shortcuts {
    public static final By GOOGLE_SEARCH_FIELD = By.id("lst-ib");
    public static final By FIRST_LINK = By.xpath("//li[1]/div[@class='rc']/h3/a");
    public static final By IMAGES_BUTTON = By.xpath("//*[@id='hdtb-msb']/div[2]/a");
    public static final By IMAGES_LINKS = By.cssSelector("img");
    public static final String FILE_PLACE = "src/main/resources/screenshot.png";

    public static final By BACK_LINK = By.id("logo");
    public static final By GOOGLE_LOGO = By.id("hplogo");
    public static final String HIDE_GOOGLE_LOGO = "document.getElementById('hplogo').style.visibility = 'hidden';";

    public static final String CHANGE_LINK_COLOUR = "arguments[0].style.color = 'red'";
    public static final By RED_LINK = By.xpath("//li[1]/div[@class='rc']/h3/a[@style = 'color: red;']");

}
