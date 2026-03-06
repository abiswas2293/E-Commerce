package testClasses;

import org.testng.annotations.Test;
import pageClass.productPage;
import utility.Baseclass;

public class productPageTest extends Baseclass {
    homePageTest hpt=new homePageTest();
    productPage pp=new productPage();


    @Test
    public void addCart() throws InterruptedException {
        hpt.selectProduct();
        pp.addToCart();
        pp.goToCart();
    }
}
