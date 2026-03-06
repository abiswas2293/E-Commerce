package pageClass;

import utility.CommonFunctionsClass;

public class checkoutPersonalDetails extends CommonFunctionsClass {
    CommonFunctionsClass cf=new CommonFunctionsClass();

    public void personalDetails() throws InterruptedException {
        //String email="//label[text()='Email']";
        String firstname="//input[@placeholder='Ex. John']";
        String lastName="//input[@placeholder='Ex. Doe']";
        String continueButton="//span[text()='Continue']";
        String zipcode="//label[text()='Zip Code']";

       // cf.typeText(email,"test@qabrains.com");
        Thread.sleep(3000);
        cf.typeText(firstname,"AB");
        cf.typeText(lastName,"XY");
        cf.click(continueButton);
        //cf.typeText(zipcode,"123456");


    }
}
