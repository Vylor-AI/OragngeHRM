package TestPages;

import Pages.ContactUsFormPage;
import org.testng.annotations.Test;
import org.testng.Assert;
import utils.BaseTest;

public class ContactUsFormPageTest extends BaseTest {

    ContactUsFormPage obj;

    @Test
    public void checkContactForm(){

        obj = new ContactUsFormPage(driver);

        obj.HomeCheck();
        Assert.assertTrue(obj.isHomeCheckVisible(), "Home section is not visible on Contact Us Form page");
        obj.contactUsFormButtonFun();

        obj.checkGetInTouchVisible();
        Assert.assertTrue(obj.isGetInTouchVisible(), "Get In Touch heading is not visible on Contact Us Form page");

        obj.setNameContact("aya");
        obj.setEmailContact("ayaali@gmail.com");
        obj.setSubjectContact("bla bla");
        obj.setMessageContact("brjhbvejhvbejhbvjbvjhbvjhbjh");
        obj.setFileContact("C:/Users/Aya Ali/OneDrive/Desktop/Ahmed-Ali final-cv.pdf");

        obj.clickSubmitButton();

        obj.alertFun();

        obj.verifySuccessMessage();
        Assert.assertTrue(obj.isSuccessMessageVisible(), "Success message is not visible on Contact Us Form page");
        obj.goHomeButtonFun();
        obj.HomeCheck();
        Assert.assertTrue(obj.isHomeCheckVisible(), "Home section is not visible after navigation back on Contact Us Form page");
    }

}
