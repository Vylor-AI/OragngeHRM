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

        obj.checkNavigationIntoRightProductFun();
        // Assertions moved from page object
        Assert.assertEquals(obj.getProductName(), "Blue Top", "Product Name Fail");
        Assert.assertEquals(obj.getProductCategory(), "Category: Women > Tops", "Product Category Fail");
        Assert.assertEquals(obj.getProductPrice(), "Rs. 500", "Product Price Fail");
        Assert.assertEquals(obj.getProductAvailability(), "Availability:", "Product Avability Fail");
        Assert.assertEquals(obj.getProductCondition(), "Condition:", "Product Condition Fail");
        Assert.assertEquals(obj.getProductBrand(), "Brand:", "Product Brand Fail");
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
