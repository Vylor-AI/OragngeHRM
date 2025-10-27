package TestPages;

import Pages.TestCasesPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BaseTest;

public class TestCasesPageTest extends BaseTest {

    TestCasesPage obj;

    @Test
    public void verifyTestCasesPage(){
        obj = new TestCasesPage(driver);
        Assert.assertTrue(obj.HomeCheck());
        obj.testCasesButtonFun();
        Assert.assertTrue(obj.verifyTestCasesButtonFun());
    }
}