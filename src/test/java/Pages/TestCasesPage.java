package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestCasesPage {

    WebDriver driver;

    public TestCasesPage(WebDriver driver) {
        this.driver = driver;
    }

    By homeCheck = By.cssSelector("body > section:nth-child(3) > div > div > div.col-sm-9.padding-right > div.features_items > h2");
    By verifyTestCasesButton = By.cssSelector("#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(7) > a");

    public void HomeCheck() {
        // visibility moved to test via getter
    }

    public void verifyTestCasesButton() {
        // visibility moved to test via getter
    }

    // Getters for visibility assertions in tests
    public boolean isHomeCheckVisible() {
        return driver.findElement(homeCheck).isDisplayed();
    }

    public boolean isTestCasesButtonVisible() {
        return driver.findElement(verifyTestCasesButton).isDisplayed();
    }
}
