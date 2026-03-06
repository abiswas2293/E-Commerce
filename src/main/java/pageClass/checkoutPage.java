package pageClass;

import utility.CommonFunctionsClass;

public class checkoutPage extends CommonFunctionsClass {
    CommonFunctionsClass cf=new CommonFunctionsClass();

    public void checkout(){
        String checkOut="//span[text()='Checkout']";
        cf.click(checkOut);
    }
}
