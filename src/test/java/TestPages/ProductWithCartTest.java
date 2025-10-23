package TestPages;

import Pages.ProductWithCart;
import org.testng.annotations.Test;
import org.testng.Assert;
import utils.BaseTest;

public class ProductWithCartTest extends BaseTest {

    ProductWithCart obj;

    @Test
    public void deleteProductFromCartTest(){
        obj = new ProductWithCart(driver);

        obj.HomeCheck();
        Assert.assertTrue(obj.isHomeCheckVisible(), "Home section is not visible on ProductWithCart page");

        obj.chooseProductFromHome();
        Assert.assertTrue(obj.isFirstProductAddedToCartVisible(), "First product was not added to cart from Home");

        obj.goToCart();
        Assert.assertTrue(obj.isCartPageVisible(), "Cart page is not visible after adding product");

        obj.deleteProductFromCart();
        Assert.assertTrue(obj.isCartEmptyVisible(), "Cart is not empty after deleting product");
    }
}
