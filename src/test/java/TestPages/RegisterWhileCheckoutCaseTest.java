package TestPages;

import Pages.RegisterWhileCheckoutCase;
import org.testng.annotations.Test;
import org.testng.Assert;
import utils.BaseTest;

public class RegisterWhileCheckoutCaseTest extends BaseTest {
    RegisterWhileCheckoutCase obj;

    @Test
    public void registerWhileCheckoutCaseTestFun(){
        obj = new RegisterWhileCheckoutCase(driver);

        obj.HomeCheck();
        Assert.assertTrue(obj.isHomeCheckVisible(), "Home section is not visible on RegisterWhileCheckoutCase page");

        obj.clickOnAddToCartFirstProduct();
        obj.goToContinueShopping();
        obj.clickOnAddToCartSecondProduct();

        obj.goToCartPage();
        Assert.assertTrue(obj.isCartPageVisible(), "Cart page is not visible after adding products");

        obj.proceedToCheckout();
        obj.registerOrLogin();
        obj.setUserName("MODY");
        obj.setEmailAddress("mody2002@gmail.com");
        obj.setSignUpButton();

        Assert.assertTrue(obj.isNewUserSignUpVisible(), "New user signup heading is not visible after submitting signup form");

        obj.setMr();
        obj.setMrs();
        obj.setPassword("123456789");
        obj.setDayDate("7");
        obj.setMonthDate("May");
        obj.setYearDate("2002");
        obj.setNewsletter();
        obj.setSpecialOffers();
        obj.setFirstName("Mody");
        obj.setLastName("Ali");
        obj.setCompanyName("Egypt");
        obj.setAddressField("frehigknaagkn");
        obj.setAddress2Field("jkejkebjkbk");
        obj.setCountryField("bafjkvfjkab");
        obj.setStateField("cairo");
        obj.setCityField("gesr el suaz");
        obj.setZipCode("223344");
        obj.setMobileNumber("012334455");

        obj.setCreateAccountButton();
        Assert.assertTrue(obj.isNewUserSignUpVisible(), "New user signup confirmation is not visible after account creation");

        obj.verifyAddressDetails();
        Assert.assertTrue(obj.isAddressDetailsVisible(), "Address details are not visible on checkout page");

        obj.verifyReviewYourOrder();
        Assert.assertTrue(obj.isReviewYourOrderVisible(), "Review your order section is not visible on checkout page");

        obj.writeCommentInTextArea("jrkgnerjknrjk");
        obj.clickOnPlaceOrder();

        obj.setNameOnCard("mody");
        obj.setCardNumber("wekjerjkb");
        obj.setCvc("222");
        obj.setExpirationMonth("02");
        obj.setExpirationYear("2024");
        obj.clickOnPayAndConfirmOrder();
        Assert.assertTrue(obj.isSuccessMessageVisible(), "Success message is not visible after payment confirmation");

        obj.clickOnDelete();
        obj.verifyCheckDeleted();
        Assert.assertTrue(obj.isCheckDeletedVisible(), "Deleted account confirmation is not visible after account deletion");
    }
}
