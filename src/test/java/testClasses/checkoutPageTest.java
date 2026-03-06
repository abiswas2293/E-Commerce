package testClasses;

import org.testng.annotations.Test;
import pageClass.checkoutPage;
import utility.Baseclass;

public class checkoutPageTest extends Baseclass {
    productPageTest ppt=new productPageTest();
    checkoutPage cp=new checkoutPage();


    @Test
    public void successfulCheckOut() throws InterruptedException {
        ppt.addCart();
        Thread.sleep(3000);
        cp.checkout();
    }
}
