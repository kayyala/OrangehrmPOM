package com.orangehrm.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

/**
 * Created by Sudhakar on 20/09/2017.
 */
public class LoginPage {
   public static WebDriver driver;
    @FindBy(id = "txtUsername")
    WebElement username;
    @FindBy(id = "txtPassword")
    WebElement password;
    @FindBy(id = "btnLogin")
    WebElement login;

public LoginPage(WebDriver driver){
    this.driver=driver;
}
    public void loginhrmPage(String uname,String passw){
        username.sendKeys(uname);
        password.sendKeys(passw);
        login.click();
        int size = driver.findElements(By.tagName("iframe")).size();
        System.out.print("total frames in page  " + size);
        driver.switchTo().frame(0);
        String actual=driver.findElement(By.xpath(".//*[@id='primary-header']/div/nav/div/ul[1]/li[2]/span[1]")).getText();
        String expected = "Dashboard";
        System.out.println("expected result  "+expected);
        //Assert.assertTrue(actual.contains("Dashboard"));
        Assert.assertEquals(actual,expected);

    }
}
