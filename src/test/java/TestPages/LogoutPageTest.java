package TestPages;

import Pages.LogoutPage;
import org.testng.annotations.Test;
import org.testng.Assert;
import utils.BaseTest;

public class LogoutPageTest extends BaseTest {

    LogoutPage obj;

    @Test
    public void logoutFun(){
        obj = new LogoutPage(driver);

        obj.HomeCheck();
        Assert.assertTrue(obj.isHomeCheckVisible(), "Home section is not visible on Logout page");

        obj.SingInAndSignUpButton();
        Assert.assertTrue(obj.isSignInAndSignUpButtonVisible(), "Sign in and Sign up button is not visible on Logout page");

        obj.NewUserSignUpVisible();
        Assert.assertTrue(obj.isNewUserSignUpVisible(), "New User Signup heading is not visible on Logout page");

        obj.setEmailAddressField("ayaali@gmail.com");
        obj.setPasswordField("123456789");
        obj.setSignUpButton();

        obj.checkUserNameBar();
        Assert.assertTrue(obj.isUserNameBarVisible(), "Username bar is not visible after login on Logout page");

        obj.logoutButtonFun();
        Assert.assertTrue(obj.isLogoutButtonVisible(), "Logout button is not visible on Logout page");
    }
}
