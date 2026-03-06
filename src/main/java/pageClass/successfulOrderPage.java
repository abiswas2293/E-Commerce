package pageClass;

import utility.CommonFunctionsClass;

public class successfulOrderPage extends CommonFunctionsClass {
    CommonFunctionsClass cf=new CommonFunctionsClass();

    public void successfulOrder(){
        String successfulMessage="//h3[text()='Checkout: Complete!']";
        cf.assertion(successfulMessage,"Checkout: Complete!");
    }
}
