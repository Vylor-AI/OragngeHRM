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
        Assert.assertTrue(obj.isHomeCheckVisible(), "Home section is not visible on Product page");
        obj.productsButtonFun();

        obj.verifyProductsButtonFun();
        Assert.assertTrue(obj.isVerifyProductsButtonVisible(), "Products heading is not visible on Product page");

        obj.verifyProductsListVisibleFun();
        Assert.assertTrue(obj.isProductsListVisible(), "Products list is not visible on Product page");

        obj.clickOnViewProductFun();

        obj.checkNavigationIntoRightProductFun();
        Assert.assertTrue(obj.isNavigationIntoRightProductVisible(), "Navigation into product details is not visible on Product page");

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
        Assert.assertTrue(obj.isHomeCheckVisible(), "Home section is not visible on Product page");
        obj.productsButtonFun();

        obj.verifyProductsButtonFun();
        Assert.assertTrue(obj.isVerifyProductsButtonVisible(), "Products heading is not visible on Product page");

        obj.verifyProductsListVisibleFun();
        Assert.assertTrue(obj.isProductsListVisible(), "Products list is not visible on Product page");

        obj.addValueToSearchBar("Blue Top");
        obj.clickOnSearchButton();

        obj.verifySearchedProductFun();
        Assert.assertTrue(obj.isVerifySearchedProductVisible(), "Searched product heading is not visible on Product search results page");
        obj.getRelatedSearchProductsFun();
        Assert.assertTrue(obj.isRelatedSearchProductsVisible(), "Related search products are not visible on Product search results page");
    }
}
