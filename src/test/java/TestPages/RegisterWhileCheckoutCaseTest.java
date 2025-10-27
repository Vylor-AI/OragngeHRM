package TestPages;

import Pages.RegisterWhileCheckoutCase;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BaseTest;

public class RegisterWhileCheckoutCaseTest extends BaseTest {

    RegisterWhileCheckoutCase obj;

    @Test
    public void registrationDuringCheckoutTest(){
        obj = new RegisterWhileCheckoutCase(driver);
        Assert.assertTrue(obj.HomeCheck());
        obj.clickOnAddToCartFirstProduct();
        obj.goTocontinoueShopping();
        obj.clickOnAddToCartSeconedProduct();
        obj.goToCartPage();
        Assert.assertTrue(obj.verifyCartPageFun());
        obj.ClickOnProcceedToCheckout();
        obj.ClickOnRegisterORLogin();
        obj.setUserName("Aya");
        obj.setEmailAddress("ayaali@gmail.com");
        obj.setSignUpButton();
        Assert.assertTrue(obj.verifyNewUserCreated());
        obj.clickOnCartButton();
        Assert.assertTrue(obj.verifyAddressDetails());
        Assert.assertTrue(obj.verifyReviewYourOrder());
        obj.writeCommentInTextArea("Test comment");
        obj.clickOnPlaceOrder();
        obj.setNameOnCard("Aya Ali");
        obj.setCardNumber("4111111111111111");
        obj.setCvc("123");
        obj.setExpirationMonth("12");
        obj.setExpirationYear("2025");
        obj.clickOnPayAndConfirmOrder();
        Assert.assertTrue(obj.checkSuccessMessage());
        obj.clickOnDelete();
        Assert.assertTrue(obj.verifyCheckDeleted());
    }
}