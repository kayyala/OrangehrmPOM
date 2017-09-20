package com.orangehrm.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Sudhakar on 20/09/2017.
 */
public class HomePage {
    WebDriver driver;


    @FindBy(xpath = ".//*[@id='account-job']/i")
    WebElement Accout_job;
    @FindBy(xpath = ".//*[@id='user_menu']/li[4]/a")
    WebElement Logout;
    @FindBy(xpath = ".//*[@id='menu_pim_viewPimModule']/a/span[2]")
    WebElement PIM;
    @FindBy(className = "left-menu-title")
    WebElement Addemp;
    @FindBy(id = "firstName")
    WebElement firstname;
    @FindBy(xpath = ".//*[@id='menu_pim_addEmployee']/span[2]")
    WebElement getAddemp;
    @FindBy(xpath = ".//*[@id='lastName']")
    WebElement lname;
    @FindBy(xpath = ".//*[@id='location_inputfileddiv']/div/input")
    WebElement selectdropdown;
    @FindBy(xpath = ".//*[@id='select-options-a0a6500f-56b5-224a-c849-f61a7eafc7f8']/li[6]/span")
    WebElement selctcountryname;

    @FindBy(xpath = ".//*[@id='systemUserSaveBtn']")
    WebElement savenew_emp;

    public HomePage() {
        this.driver = driver;
    }
//    public  void pim() throws Exception {
//        Thread.sleep(2000);
//        PIM.click();}


    public void addemp() {

//driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        System.out.println("THIS IS CLICKING TO pim page");
        PIM.click();
        firstname.sendKeys("sudha");
        lname.sendKeys("mamam");
        Actions actions = new Actions(driver);
        actions.moveToElement(selectdropdown).click().build().perform();
        selctcountryname.click();
        savenew_emp.click();

    }
}
