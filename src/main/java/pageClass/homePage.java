package pageClass;

import utility.CommonFunctionsClass;

public class homePage extends CommonFunctionsClass {
    CommonFunctionsClass cf=new CommonFunctionsClass();

    public void sortingMenu(){
        String sorting="//button[text()='Select...']";
        String highToLow="//div[text()='High to Low (Price)']";
        cf.click(sorting);
        cf.click(highToLow);
    }

    public void chooseProduct(){
        String shoe="//img[@alt='Sample Shoe Name']";
        cf.click(shoe);
    }


}
