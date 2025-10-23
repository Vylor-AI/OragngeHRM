package TestPages;

import Pages.ProductWithCart;
import org.testng.annotations.Test;
import utils.BaseTest;

public class ProductWithCartTest extends BaseTest {

    ProductWithCart obj;

//    @Test
//    public void verifyProductsQyantityInCart(){
//
//        obj = new ProductWithCart(driver);
//
//        obj.HomeCheck();
//
//        obj.goToProductsPage();
//
//        obj.clickOnAddToCartFirstProduct();
//
//        obj.goTocontinoueShopping();
//
//        obj.clickOnAddToCartSeconedProduct();
//
//        obj.goToCart();
//
//        obj.verifyFirstProductAddedToCart();
//        obj.verifySeconedProductAddedToCart();
//
//        obj.verifyDetailsOfFirstProduct();
//        obj.verifyDetailsOfSecondProduct();
//
//    }

    @Test
    public void deleteProductFromCartTest(){
        obj = new ProductWithCart(driver);
        obj.HomeCheck();
        obj.chooseProductFromHome();
        obj.goToCart();
        obj.checkVerifyCartPage();
        obj.checkDeleteProductFromCart();
        obj.checkVerifyCartEmpty();
    }
}
