package TestPages;

import Pages.RegisterPage;
import org.testng.annotations.Test;
import org.testng.Assert;
import utils.BaseTest;

public class RegisterPageTest extends BaseTest {

    RegisterPage obj;

    @Test
    public void registerWithExistingUser(){
        obj = new RegisterPage(driver);

        obj.HomeCheck();
        Assert.assertTrue(obj.isHomeCheckVisible(), "Home section is not visible on Register page");

        obj.SingInAndSignUpButton();
        Assert.assertTrue(obj.isSignInAndSignUpButtonVisible(), "Sign in and Sign up button is not visible on Register page");

        obj.NewUserSignUpVisible();
        Assert.assertTrue(obj.isNewUserSignUpVisible(), "New User Signup heading is not visible on Register page");

        obj.setUserName("Aya");
        obj.setEmailAddress("ayaali@gmail.com");
        obj.setSignUpButton();

        obj.registerWithExistedUser();
        Assert.assertTrue(obj.isAlreadyExistedUserVisible(), "Already exist user message is not visible on Register page");
    }
}
