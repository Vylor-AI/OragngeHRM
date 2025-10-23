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
        obj.checkDetailsOfFirstProduct();

        // Verify product details assertions moved from page object
        String name = obj.getProductName();
        Assert.assertEquals(name, "Blue Top", "Product Name Fail");
        String category = obj.getProductCategory();
        Assert.assertEquals(category, "Category: Women > Tops", "Product Category Fail");
        String price = obj.getProductPrice();
        Assert.assertEquals(price, "Rs. 500", "Product Price Fail");
        String availability = obj.getProductAvailability();
        Assert.assertEquals(availability, "Availability:", "Product Availability Fail");
        String condition = obj.getProductCondition();
        Assert.assertEquals(condition, "Condition:", "Product Condition Fail");
        String brand = obj.getProductBrand();
        Assert.assertEquals(brand, "Brand:", "Product Brand Fail");
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
