package TestPages;

import Pages.LogoutPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BaseTest;

public class LogoutPageTest extends BaseTest {

    LogoutPage obj;

    @Test
    public void logoutFun(){
        obj = new LogoutPage(driver);
        Assert.assertTrue(obj.HomeCheck());
        obj.SingInAndSignUpButton();
        Assert.assertTrue(obj.NewUserSignUpVisible());
        obj.setEmailAddressField("ayaali@gmail.com");
        obj.setPasswordField("123456789");
        obj.setSignUpButton();
        Assert.assertTrue(obj.checkUserNameBar());
        obj.logoutButtonFun();
        Assert.assertTrue(obj.NewUserSignUpVisible());
    }
}
