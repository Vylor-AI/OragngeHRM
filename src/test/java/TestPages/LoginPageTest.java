package TestPages;

import Pages.LoginPage;
import org.testng.annotations.Test;
import org.testng.Assert;
import utils.BaseTest;

public class LoginPageTest extends BaseTest {

    LoginPage obj;

    @Test
    public void inValidLogin(){
        obj = new LoginPage(driver);

        obj.HomeCheck();
        Assert.assertTrue(obj.isHomeCheckVisible(), "Home section is not visible on Login page");

        obj.SingInAndSignUpButton();
        Assert.assertTrue(obj.isSignInAndSignUpButtonVisible(), "Sign in and Sign up button is not visible on Login page");

        obj.setEmailAddressField("ayaal@gmail.com");
        obj.setPasswordField("12345679");
        obj.setSignUpButton();

        obj.checkInValidLoginMessageVisability();
        Assert.assertTrue(obj.isInvalidLoginMessageVisible(), "Invalid login message is not visible on Login page");
    }
}
