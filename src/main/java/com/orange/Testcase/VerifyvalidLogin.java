package com.orange.Testcase;

import com.Helpers.Browsers;
import com.orangehrm.Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by Sudhakar on 20/09/2017.
 */

public class VerifyvalidLogin {
    @Test
    public static void login() {

        WebDriver driver = Browsers.startbrowser("chrome", "https://qamasterssri-trials63.orangehrmlive.com/auth/login");

        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

        loginPage.loginhrmPage("Admin", "RRofxm4R");
    }
}
