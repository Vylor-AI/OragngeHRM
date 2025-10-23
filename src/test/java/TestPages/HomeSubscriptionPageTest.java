package TestPages;

import Pages.HomeSubscriptionPage;
import org.testng.annotations.Test;
import org.testng.Assert;
import utils.BaseTest;

public class HomeSubscriptionPageTest extends BaseTest {

    HomeSubscriptionPage obj;

    @Test
    public void verifySubscriptionInHome(){

        obj = new HomeSubscriptionPage(driver);

        obj.HomeCheck();
        Assert.assertTrue(obj.isHomeCheckVisible(), "Home section is not visible on Home Subscription page");
        obj.verifySubscriptionFun();
        Assert.assertTrue(obj.isSubscriptionVisible(), "Subscription section is not visible on Home Subscription page");
        obj.setEmailVerication("aya@gmail.com");
        obj.clickOnSubmitButtonVerication();
        Assert.assertTrue(obj.isSuccessMessageVisible(), "Success subscribe confirmation is not visible on Home Subscription page");




    }
}
