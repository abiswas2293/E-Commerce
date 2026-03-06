package pageClass;

import utility.CommonFunctionsClass;

public class orderCompletePage extends CommonFunctionsClass {
    CommonFunctionsClass cf=new CommonFunctionsClass();

    public void orderComplete(){
        String finishButton="//span[text()='Finish']";
        cf.click(finishButton);
    }
}
