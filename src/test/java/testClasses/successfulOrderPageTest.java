package testClasses;

import org.testng.annotations.Test;
import pageClass.successfulOrderPage;
import utility.Baseclass;

public class successfulOrderPageTest extends Baseclass {
    orderCompletePageTest ocpt=new orderCompletePageTest();
    successfulOrderPage sop=new successfulOrderPage();


    @Test
    public void succesfulOrder() throws InterruptedException {
        ocpt.successfulOrderComplete();
        Thread.sleep(3000);
        sop.successfulOrder();
    }
}
