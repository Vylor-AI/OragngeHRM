package TestPages;

import Pages.CartSubscriptionPage;
import org.testng.annotations.Test;
import org.testng.Assert;
import utils.BaseTest;

public class CartSubscriptionPageTest extends BaseTest {

    CartSubscriptionPage obj;

    @Test
    public void verifyCartSubscriptionPage(){
        obj = new CartSubscriptionPage(driver);

        obj.HomeCheck();
        Assert.assertTrue(obj.isHomeCheckVisible(), "Home section is not visible on Cart Subscription page");
        obj.clickOnCartButton();
        obj.verifySubscriptionFun();
        Assert.assertTrue(obj.isSubscriptionVisible(), "Subscription section is not visible on Cart Subscription page");
        obj.setEmailVerication("ayaali@gmail.com");
        obj.clickOnCartButton();
        obj.clickOnSubmitButtonVerication();
        Assert.assertTrue(obj.isSuccessMessageVisible(), "Success subscribe confirmation is not visible on Cart Subscription page");
    }
}
