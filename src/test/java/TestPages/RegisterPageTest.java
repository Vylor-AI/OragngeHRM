package TestPages;

import Pages.RegisterPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BaseTest;

public class RegisterPageTest extends BaseTest {

    RegisterPage obj;

    @Test
    public void verifyUserRegistration() {
        obj = new RegisterPage(driver);
        Assert.assertTrue(obj.HomeCheck());
        obj.SingInAndSignUpButton();
        Assert.assertTrue(obj.NewUserSignUpVisible());
        obj.setUserName("Aya");
        obj.setEmailAddress("ayaali@gmail.com");
        obj.setSignUpButton();
        Assert.assertTrue(obj.setEnterAccountInformation());
        obj.setMr();
        obj.setMrs();
        obj.setPassword("123456789");
        obj.setDayDate("7");
        obj.setMonthDate("February");
        obj.setYearDate("2002");
        obj.setNewsLetter();
        obj.setSpecialOffers();
        obj.setFirstName("Aya");
        obj.setLastNmae("Ali");
        obj.setCompanyName("NTI");
        obj.setAddressField("jkbgakjrbakjre");
        obj.setAddress2Field("nkajgrjgbjkbjkfjkbvjkb");
        obj.setContoryField("India");
        obj.setStateField("single");
        obj.setCityField("cairo");
        obj.setZipCode("112233");
        obj.setMobileNumber("012234555");
        obj.setCreateAccountButton();
        Assert.assertTrue(obj.verifyAccountCreatedFun());
        obj.clickOnContinueButton();
    }
