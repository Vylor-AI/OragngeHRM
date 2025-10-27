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

    public boolean HomeCheck() {
        return driver.findElement(homeCheck).isDisplayed();
    }

    public boolean verifySubscriptionFun(){
        return driver.findElement(verifySubscription).isDisplayed();
    }

    public void setEmailVerication(String email){
        driver.findElement(emailVerication).sendKeys(email);
    }

    public boolean clickOnSubmitButtonVerication(){
        driver.findElement(submitButtonVerication).click();
        return driver.findElement(By.cssSelector("#success-subscribe > div")).isDisplayed();
    }
}
