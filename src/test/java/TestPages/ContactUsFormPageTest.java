package TestPages;

import Pages.ContactUsFormPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BaseTest;

public class ContactUsFormPageTest extends BaseTest {

    ContactUsFormPage obj;

    @Test
    public void checkContactForm(){

        obj = new ContactUsFormPage(driver);

        Assert.assertTrue(obj.HomeCheck());
        obj.contactUsFormButtonFun();

        Assert.assertTrue(obj.checkGetInTouchVisible());

        obj.setNameContact("aya");
        obj.setEmailContact("ayaali@gmail.com");
        obj.setSubjectContact("bla bla");
        obj.setMessageContact("brjhbvejhvbejhbvjbvjhbvjhbjh");
        obj.setFileContact("C:/Users/Aya Ali/OneDrive/Desktop/Ahmed-Ali final-cv.pdf");

        obj.clickSubmitButton();

        obj.alertFun();

        Assert.assertTrue(obj.verifySuccessMessage());
        obj.goHomeButtonFun();
        Assert.assertTrue(obj.HomeCheck());
    }

}
