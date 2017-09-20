import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

/**
 * Created by Sudhakar on 17/09/2017.
 */
public class DeleteEMP extends BasePage {
    public void deleteEmp() throws Exception {
        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
        driver.findElement(By.xpath(".//*[@id='employee_name_quick_filter_employee_list_value']")).sendKeys("dad");
        Thread.sleep(10000);
//        driver.findElement(By.xpath(".//*[@id='employee_name_quick_filter_employee_list_value']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//*[@id='quick_search_icon']")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath(".//*[@id='employeeListTable']/tbody/tr/td[1]/label")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(".//*[@id='employeeListTable']/thead/tr/th[1]/a/i")).click();
        Thread.sleep(2000);

        //driver.findElement(By.xpath("//*[text()='Delete Selected']")).click();
        driver.findElement(By.xpath("/*[@ng-click='vm.delete()']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@ng-click='modal.confirm()']")).click();

    }
}
