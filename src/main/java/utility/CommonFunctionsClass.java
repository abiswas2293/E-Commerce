package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

import static utility.Baseclass.driver;

public class CommonFunctionsClass {
    Actions action;

    // Explicit no-arg constructor so code that expects it compiles cleanly
    public CommonFunctionsClass() {
    }

    public void click(String locator) {
        driver.findElement(By.xpath(locator)).click();
    }

    public void typeText(String locator, String text) {
        WebElement e = driver.findElement(By.xpath(locator));
        e.clear();
        e.sendKeys(text);
    }

    public void dropDown(String locator, String text) {
        WebElement e = driver.findElement(By.xpath(locator));
        Select select = new Select(e);
        select.selectByVisibleText(text);
    }

    public void assertion(String locator, String expectedText) {
        String actualText = driver.findElement(By.xpath(locator)).getText();
        Assert.assertEquals(actualText, expectedText);
    }

    public List<WebElement> returnListOfWebElements(String locator) {
        return driver.findElements(By.xpath(locator));
    }

    public void pressEnter() {
        action = new Actions(driver);
        action.sendKeys(Keys.ENTER).perform();

    }

}
