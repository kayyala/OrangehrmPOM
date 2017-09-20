import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

/**
 * Created by Sudhakar on 13/09/2017.
 */
public class HomePage extends BasePage {
    public String isOnHomePage() {
        return driver.getCurrentUrl();
    }

    public void login() throws Exception {

//        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
        driver.findElement(By.xpath(".//*[@id='txtUsername']")).clear();
        driver.findElement(By.xpath(".//*[@id='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath(".//*[@id='txtPassword']")).clear();
        driver.findElement(By.xpath(".//*[@id='txtPassword']")).sendKeys("RRofxm4R");
        driver.findElement(By.xpath(".//*[@id='btnLogin']")).click();
        System.out.println("Login sucessfully " + driver.getTitle());
        Thread.sleep(3000);
        int size = driver.findElements(By.tagName("iframe")).size();
        System.out.print("total frames in page  " + size);
        driver.switchTo().frame(0);
        String actual=driver.findElement(By.xpath(".//*[@id='primary-header']/div/nav/div/ul[1]/li[2]/span[1]")).getText();
        String expected = "Dashboard";
        System.out.println("expected result  "+expected);
        //Assert.assertTrue(actual.contains("Dashboard"));
    }
    public void logout() throws Exception {
        System.out.println(" THIS is url  " + driver.getTitle());

        Thread.sleep(3000);
        driver.findElement(By.xpath(".//*[@id='account-job']/i")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(".//*[@id='user_menu']/li[4]/a")).click();
        System.out.println("Account as been logout succesfully");

    }
}
