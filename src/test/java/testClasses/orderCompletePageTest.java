package testClasses;

import org.testng.annotations.Test;
import pageClass.orderCompletePage;
import utility.Baseclass;

public class orderCompletePageTest extends Baseclass {
    checkoutPersonalDetailsPageTest cpdpt=new checkoutPersonalDetailsPageTest();
    orderCompletePage ocp=new orderCompletePage();


    @Test
    public void successfulOrderComplete() throws InterruptedException {
        cpdpt.successfulPersonalDetails();
        Thread.sleep(3000);
        ocp.orderComplete();
    }
}
