package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomeSubscriptionPage {

    WebDriver driver;

    public HomeSubscriptionPage(WebDriver driver) {
        this.driver = driver;
    }

    By homeCheck = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[1]/a");
    By verifySubscription = By.xpath("//*[@id=\"footer\"]/div[1]/div/div/div[2]/div/h2");
    By emailVerication = By.xpath("//*[@id=\"susbscribe_email\"]");
    By submitButtonVerication = By.xpath("//*[@id=\"subscribe\"]");

    public void HomeCheck() {
        // visibility moved to test via getter
    }

    public void verifySubscriptionFun() {
        // visibility moved to test via getter
    }

    public void setEmailVerication(String email) {
        driver.findElement(emailVerication).sendKeys(email);
    }

    public void clickOnSubmitButtonVerication() {
        driver.findElement(submitButtonVerication).click();
        // visibility moved to test via getter
        // driver.findElement(submitButtonVerication).click();
    }

    // Getters for visibility assertions in tests
    public boolean isHomeCheckVisible() {
        return driver.findElement(homeCheck).isDisplayed();
    }

    public boolean isSubscriptionVisible() {
        return driver.findElement(verifySubscription).isDisplayed();
    }

    public boolean isSuccessMessageVisible() {
        return driver.findElement(By.cssSelector("#success-subscribe > div")).isDisplayed();
    }
}
