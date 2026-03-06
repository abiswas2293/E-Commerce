package pageClass;

import utility.CommonFunctionsClass;

public class loginPage extends CommonFunctionsClass {
    CommonFunctionsClass cf=new CommonFunctionsClass();

    public void email(){
        String email="//input[@id='email']";
        cf.typeText(email,"test@qabrains.com");
    }

    public void password(){
        String password="//input[@id='password']";
        cf.typeText(password,"Password123");
    }

    public void login(){
        String login="//button[text()='Login']";
        cf.click(login);
    }
}
