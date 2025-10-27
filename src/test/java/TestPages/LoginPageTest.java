package TestPages;

import Pages.LoginPage;
import Pages.RegisterPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BaseTest;

public class LoginPageTest extends BaseTest {

    LoginPage obj;

//    @Test
//    public void validLogin(){
//        obj = new LoginPage(driver);
//        obj.HomeCheck();
//        obj.SingInAndSignUpButton();
//        obj.setEmailAddressField("ayaali@gmail.com");
//        obj.setPasswordField("123456789");
//        obj.setSignUpButton();
//        obj.checkUserNameBar();
//        obj.deleteButton();
//        obj.checkIsDeleted();
//    }

    @Test
    public void inValidLogin(){
        obj = new LoginPage(driver);
        Assert.assertTrue(obj.HomeCheck());
        obj.SingInAndSignUpButton();
        obj.setEmailAddressField("ayaal@gmail.com");
        obj.setPasswordField("12345679");
        obj.setSignUpButton();

//        obj.checkUserNameBar();
//        obj.deleteButton();
//        obj.checkIsDeleted();

        Assert.assertTrue(obj.checkInValidLoginMessageVisability());
    }
}
