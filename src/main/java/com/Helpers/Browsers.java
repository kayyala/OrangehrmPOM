package com.Helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * Created by Sudhakar on 20/09/2017.
 */
public class Browsers {
    static WebDriver driver;
@BeforeMethod
    public static WebDriver startbrowser(String browsername, String url) {
        if (browsername.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (browsername.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sudhakar\\SeleniumDriver\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browsername.equalsIgnoreCase("ie")) {
            driver = new InternetExplorerDriver();
        }
       // driver.manage().window().maximize();
        driver.get(url);
        return driver;

    }
    @AfterMethod
 public void browserclose(){
        driver.close();
    }

}
