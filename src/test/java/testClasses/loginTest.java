package testClasses;

import org.testng.annotations.Test;
import pageClass.loginPage;
import utility.Baseclass;

public class loginTest extends Baseclass {
    loginPage lp=new loginPage();

    @Test
    public void successfulLogin(){
        lp.email();
        lp.password();
         lp.login();
    }
}
