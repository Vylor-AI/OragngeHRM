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

        obj.HomeCheck();
        Assert.assertTrue(obj.isHomeCheckVisible(), "Home section is not visible on Product Quantity In Cart page");

        obj.clickOnViewProduct();

        obj.verifyProductDetailIsOpened();
        Assert.assertTrue(obj.isProductDetailOpenedVisible(), "Product detail page is not opened");

        obj.clickOnAddToCartFirstProduct();
        obj.clickOnAddToCart();
        obj.clickOnViewCart();

        Assert.assertEquals(obj.getQuantityInCart(), obj.getSelectedQuantity(),
            "Quantity in cart does not match selected quantity");
    }
}
