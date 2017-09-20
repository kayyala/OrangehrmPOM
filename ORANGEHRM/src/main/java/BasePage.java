import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by Sudhakar on 13/09/2017.
 */
public class BasePage {
    static WebDriver driver;

    @BeforeClass
    public void openBrowser() throws IOException {
        System.out.println("opening browser");
        Properties prop = new Properties();
        FileInputStream fileInputStreamfs = new FileInputStream("C:\\Users\\Sudhakar\\IdeaProjects\\ORANGEHRM\\ORANGEHRM\\src\\main\\resources\\config.properties");
        prop.load(fileInputStreamfs);
        String url = prop.getProperty("url");
        String browser = prop.getProperty("browser");
        System.out.print("browser: " + browser);
        switch (browser) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sudhakar\\SeleniumDriver\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
                driver = new ChromeDriver();
                break;
            case "firefox":
                System.setProperty("webdriver.gecko.driver", "SeleniumDriver/geckodriver-v0.11.1-win32/geckodriver.exe");
                driver= new FirefoxDriver();
                break;
                default:
                System.setProperty("webdriver.ie.driver", "\\SeleniumDrivers\\IEDriver\\IEDriverServer.exe");
                driver = (new InternetExplorerDriver());
                break;
        }
        driver.get(url);
    }
    public void closeBrowser()


    {
        driver.quit();
    }
}
