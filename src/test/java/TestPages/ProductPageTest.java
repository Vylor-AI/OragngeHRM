package TestPages;

import Pages.ProductPage;
import org.testng.annotations.Test;
import org.testng.Assert;
import utils.BaseTest;

public class ProductPageTest extends BaseTest {

    ProductPage obj;

    @Test
    public void verifyAllProductsAndProductDetailsPage(){

        obj = new ProductPage(driver);

        obj.HomeCheck();
        obj.productsButtonFun();
        obj.verifyProductsButtonFun();

        obj.verifyProductsVisableFun();
        obj.clickOnViewProductFun();

        Assert.assertTrue(obj.checkNavigationIntoRightProductFun(), "Navigation into right product page failed");
        obj.checkDetailsOfFirstProduct();
    }

    @Test
    public void searchProduct(){

        obj = new ProductPage(driver);

        obj.HomeCheck();
        obj.productsButtonFun();
        obj.verifyProductsButtonFun();

        obj.verifyProductsVisableFun();

        obj.addValueToSearchBar("Blue Top");
        obj.clickOnSearchButton();

        obj.verifySearchedProductFun();
        obj.getRelatedSearchProductsFun();
    }
}
