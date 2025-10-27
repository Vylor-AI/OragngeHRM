package TestPages;

import Pages.ProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BaseTest;

public class ProductPageTest extends BaseTest {

    ProductPage obj;

    @Test
    public void verifyAllProductsAndProductDetailsPage(){

        obj = new ProductPage(driver);

        Assert.assertTrue(obj.HomeCheck());
        obj.productsButtonFun();
        Assert.assertTrue(obj.verifyProductsButtonFun());
        Assert.assertTrue(obj.verifyProductsVisableFun());
        obj.clickOnViewProductFun();

        Assert.assertTrue(obj.checkNavigationIntoRightProductFun());
        Assert.assertEquals(obj.getProductNameText(), "Blue Top", "Product Name Fail");
        Assert.assertEquals(obj.getProductCategoryText(), "Category: Women > Tops", "Product Category Fail");
        Assert.assertEquals(obj.getProductPriceText(), "Rs. 500", "Product Price Fail");
        Assert.assertEquals(obj.getProductAvailabilityText(), "Availability:", "Product Availability Fail");
        Assert.assertEquals(obj.getProductConditionText(), "Condition:", "Product Condition Fail");
        Assert.assertEquals(obj.getProductBrandText(), "Brand:", "Product Brand Fail");
    }

    @Test
    public void searchProduct(){

        obj = new ProductPage(driver);

        Assert.assertTrue(obj.HomeCheck());
        obj.productsButtonFun();
        Assert.assertTrue(obj.verifyProductsButtonFun());
        Assert.assertTrue(obj.verifyProductsVisableFun());

        obj.addValueToSearchBar("Blue Top");
        obj.clickOnSearchButton();

        Assert.assertTrue(obj.verifySearchedProductFun());
        Assert.assertTrue(obj.getRelatedSearchProductsFun());
    }
}
