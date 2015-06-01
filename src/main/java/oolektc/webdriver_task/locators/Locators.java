package oolektc.webdriver_task.locators;

import org.openqa.selenium.By;

public final class Locators {

    public static final By SEARCH_FIELD = By.id("lst-ib");
    public static final By LOGO = By.id("hplogo");

    public static final By FIRST_RESULT_LINK = By.xpath("(.//*[@class='srg']//a)[1]");
    public static final By IMAGES_TAB = By.xpath("(.//*[@id='hdtb-msb']//a)[1]");
    public static final By IMAGES_PAGE_IMAGE = By.xpath("(.//*[@id='rg_s']//img)");

    public static final By HEADER_GOOGLE_LOGO = By.xpath("(.//*[@id='searchform']//img)[1]");

}
