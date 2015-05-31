/*
* Copyright (C) 2015 PageObjectTask Project by Ihor Dynka
 */

package idyntc.page_object_task;

import org.openqa.selenium.By;

/**
 * Created by Ihor-Dynka on 28.05.2015.
 */

/**
 * contains all locators
 */
public final class Locators {

    public static final By GOOGLE_SEARCH = By.name("q");
    public static final By FUNNY_PICTURE_FIRST_LINK = By.cssSelector(".r>a");
    public static final By IMAGES_TAB = By.xpath(".//*[@id='hdtb-msb']/div[2]/a");
    public static final By SEARCH_RESULT_IMAGES = By.cssSelector(".rg_i");
    public static final By GOOGLE_LOGO = By.cssSelector("#hplogo");
    public static final By SMALL_GOOGLE_LOGO = By.cssSelector("#logo");

}
