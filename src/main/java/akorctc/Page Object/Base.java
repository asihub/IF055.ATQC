package akorctc;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public abstract class Base {

    protected WebDriver driver;

    //constructor
    public Base( WebDriver driver) {
        this.driver = driver;
    }
    //TODO make versatile, use file name as parameter
    public void makeScreenshot (){
        File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(sourceFile, new File("src\\01.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
