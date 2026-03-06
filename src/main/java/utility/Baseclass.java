package utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Baseclass {
    public static WebDriver driver;

    @BeforeTest
    public void openBrowser() throws InterruptedException, MalformedURLException {
        driver=new FirefoxDriver();
        WebDriverManager.firefoxdriver().setup();


        driver.manage().window().maximize();
        driver.get("https://practice.qabrains.com/ecommerce");
        Thread.sleep(2000);
    }

   // @AfterTest
   // public void closeBrowser() {
       // driver.quit();
   // }
}
