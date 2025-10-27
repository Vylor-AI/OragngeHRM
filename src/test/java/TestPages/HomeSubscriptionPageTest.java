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

        Assert.assertTrue(obj.HomeCheck());
        Assert.assertTrue(obj.verifySubscriptionFun());
        obj.setEmailVerication("aya@gmail.com");
        Assert.assertTrue(obj.clickOnSubmitButtonVerication());




    }
}
