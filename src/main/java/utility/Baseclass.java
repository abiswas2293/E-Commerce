package utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;

import static java.sql.DriverManager.getDriver;

public class Baseclass {
    public static WebDriver driver;

    @BeforeTest
    public void openBrowser() throws InterruptedException, MalformedURLException {
        //driver=new FirefoxDriver();
        //WebDriverManager.firefoxdriver().setup();
        //driver.manage().window().maximize();
       // driver.get("https://practice.qabrains.com/ecommerce");
        //Thread.sleep(2000);
       // ThreadLocal<WebDriver> driver = new ThreadLocal<>();
        // Selenium Grid URL (Selenium 4)
            String gridUrl = "http://localhost:4444";
            String browser="Firefox";

            switch (browser.toLowerCase()) {
                case "firefox":
                    FirefoxOptions firefoxOptions = new FirefoxOptions();
                    driver = new RemoteWebDriver(new URL(gridUrl), firefoxOptions);
                    break;

                case "chrome":
                default:
                    ChromeOptions chromeOptions = new ChromeOptions();
                    driver = new RemoteWebDriver(new URL(gridUrl), chromeOptions);
                    break;
            }
        driver.manage().window().maximize();
        driver.get("https://practice.qabrains.com/ecommerce");
        Thread.sleep(2000);
        System.out.println("Browser launched on Grid: " + browser);
        }








   // @AfterTest
   // public void closeBrowser() {
       // driver.quit();
   // }
}
