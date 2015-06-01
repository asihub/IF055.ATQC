package oarabtc.task_webdriver;

import org.openqa.selenium.By;

public final class Locators {

    private Locators() {
    }

    public static final By GOOGLE_SEARCH_FIELD = By.id("lst-ib");
    public static final By FIRST_RESULT_LINK = By.xpath("(.//*[@class='srg']//a)[1]");
    public static final By IMAGES_BUTTON = By.xpath("//*[@id='hdtb-msb']/div[2]/a");

    public static final By GOOGLE_MAIN_LOGO = By.id("hplogo");
    public static final By GOOGLE_LOGO = By.xpath(".//*[@id='logocont']/a/img");
    public static final By IMAGES_LINKS = By.cssSelector("img");
}