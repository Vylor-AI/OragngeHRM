package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartSubscriptionPage {

    WebDriver driver;

    public CartSubscriptionPage(WebDriver driver) {
        this.driver = driver;
    }

    By homeCheck = By.cssSelector("body > section:nth-child(3) > div > div > div.col-sm-9.padding-right > div.features_items > h2");

    By cartButton = By.cssSelector("#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(3) > a");

    By verifySubscription = By.cssSelector("#footer > div.footer-widget > div > div > div.col-sm-3.col-sm-offset-1 > div > h2");
    By emailVerication = By.cssSelector("#susbscribe_email");
    By submitButtonVerication = By.cssSelector("#subscribe");



    public boolean HomeCheck() {
        return driver.findElement(homeCheck).isDisplayed();
    }

    public void clickOnCartButton(){
        WebElement element = driver.findElement(cartButton);
        String value = element.getAttribute("href");
        driver.navigate().to(value);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

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
