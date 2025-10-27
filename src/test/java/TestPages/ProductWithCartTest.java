package TestPages;

import Pages.ProductWithCart;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BaseTest;

public class ProductWithCartTest extends BaseTest {

    ProductWithCart obj;

    @Test
    public void deleteProductFromCartTest(){
        obj = new ProductWithCart(driver);
        Assert.assertTrue(obj.HomeCheck());
        obj.chooseProductFromHome();
        obj.goToCart();
        Assert.assertTrue(obj.checkVerifyCartPage());
        obj.checkDeleteProductFromCart();
        Assert.assertTrue(obj.checkVerifyCartEmpty());
    }
}
