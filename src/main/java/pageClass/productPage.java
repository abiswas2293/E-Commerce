package pageClass;

import utility.CommonFunctionsClass;

public class productPage extends CommonFunctionsClass {
    CommonFunctionsClass cf=new CommonFunctionsClass();

    public void addToCart(){
        String addCart="//button[text()='Add to cart']";
        cf.click(addCart);
    }

    public void goToCart(){
        String goCart="//span[@class='text-[20px] sm:text-[28px] cursor-pointer relative']";
        cf.click(goCart);
    }
}
