package testClasses;

import org.testng.annotations.Test;
import pageClass.homePage;
import utility.Baseclass;

public class homePageTest extends Baseclass {
    homePage hp=new homePage();
    loginTest lt=new loginTest();

    @Test
    public void selectProduct() throws InterruptedException {
        lt.successfulLogin();
        //hp.sortingMenu();
        Thread.sleep(3000);
        hp.chooseProduct();
    }
}
