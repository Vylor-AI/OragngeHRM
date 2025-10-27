package TestPages;

import Pages.ProductQuantityInCart;
import org.testng.annotations.Test;
import org.testng.Assert;
import utils.BaseTest;

public class ProductQuantityInCartTest extends BaseTest {

    ProductQuantityInCart obj;

    @Test
    public void verifyProductQuantityInCart(){
        obj = new ProductQuantityInCart(driver);
        Assert.assertTrue(obj.HomeCheck());
        obj.clickOnViewProduct();
        Assert.assertTrue(obj.verifyProductDetailIsOpened());
        obj.clickOnAddToCartFirstProduct();
        obj.clickOnAddToCart();
        obj.clickOnViewCart();
        Assert.assertTrue(obj.verifyDetailsOfFirstProduct());

    }
}
