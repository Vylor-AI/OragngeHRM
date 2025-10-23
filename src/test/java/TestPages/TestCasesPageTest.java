package TestPages;

import Pages.TestCasesPage;
import org.testng.annotations.Test;
import org.testng.Assert;
import utils.BaseTest;

public class TestCasesPageTest extends BaseTest {

    TestCasesPage obj;

    @Test
    public void checkTestCasesPage(){
        obj = new TestCasesPage(driver);

        obj.HomeCheck();
        Assert.assertTrue(obj.isHomeCheckVisible(), "Home section is not visible on Test Cases page");

        obj.verifyTestCasesButton();
        Assert.assertTrue(obj.isTestCasesButtonVisible(), "Test Cases button is not visible on Test Cases page");
    }
}
