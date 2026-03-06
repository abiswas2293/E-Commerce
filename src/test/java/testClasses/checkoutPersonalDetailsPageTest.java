package testClasses;

import org.testng.annotations.Test;
import pageClass.checkoutPersonalDetails;
import utility.Baseclass;

public class checkoutPersonalDetailsPageTest extends Baseclass {
    checkoutPageTest cpt=new checkoutPageTest();
    checkoutPersonalDetails cpd=new checkoutPersonalDetails();


    @Test
    public void successfulPersonalDetails() throws InterruptedException {
        cpt.successfulCheckOut();
        Thread.sleep(2000);
        cpd.personalDetails();

    }
}
