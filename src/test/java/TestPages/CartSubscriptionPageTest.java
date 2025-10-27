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

        Assert.assertTrue(obj.HomeCheck());
        obj.clickOnCartButton();
        Assert.assertTrue(obj.verifySubscriptionFun());
        obj.setEmailVerication("ayaali@gmail.com");
        obj.clickOnCartButton();
        Assert.assertTrue(obj.clickOnSubmitButtonVerication());
    }
}
