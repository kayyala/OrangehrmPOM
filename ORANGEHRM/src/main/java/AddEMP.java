import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

/**
 * Created by Sudhakar on 14/09/2017.
 */
public class AddEMP extends BasePage {

    public void newPIM() throws Exception {
        driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id='menu_pim_viewPimModule']/a/span[1]")).click();
       // driver.findElement(By.xpath(".//*[@id='menu_pim_addEmployee']/span[2]")).click();

    }

    public void enterfield() throws Exception {
        Thread.sleep(2000);
        driver.findElement(By.xpath(".//*[@id='menu_pim_addEmployee']/span[2]")).click();

        driver.findElement(By.id("firstName")).sendKeys("sri1");

        driver.findElement(By.xpath(".//*[@id='lastName']")).sendKeys("beckamrr");
        Thread.sleep(2000);
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath(".//*[@id='location_inputfileddiv']/div/input"))).click().build().perform();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='select-wrapper initialized']/ul/li[5]/span")).click();
        driver.findElement(By.xpath(".//*[@id='systemUserSaveBtn']")).click();

    }

}
