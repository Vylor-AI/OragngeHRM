package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogoutPage {

    WebDriver driver;

    public LogoutPage(WebDriver driver) {
        this.driver = driver;
    }

    By homeCheck = By.cssSelector("body > section:nth-child(3) > div > div > div.col-sm-9.padding-right > div.features_items > h2");
    By singInAndSignUpButton = By.cssSelector("#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(4) > a");
    By emailAddressField = By.cssSelector("#form > div > div > div.col-sm-4.col-sm-offset-1 > div > form > input[type=email]:nth-child(2)");
    By passwordField = By.cssSelector("#form > div > div > div.col-sm-4.col-sm-offset-1 > div > form > input[type=password]:nth-child(3)");
    By newUserSignUpVisible = By.cssSelector("#form > div > div > div:nth-child(3) > div > h2");
    By signUpButton = By.cssSelector("#form > div > div > div.col-sm-4.col-sm-offset-1 > div > form > button");
    By usernameInBar = By.cssSelector("#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(10) > a > b");
    By logoutButton = By.cssSelector("#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(4) > a");

    public void HomeCheck() {
        // visibility moved to test via getter
    }

    public void SingInAndSignUpButton() {
        WebElement textField = driver.findElement(singInAndSignUpButton);
        String value2 = textField.getAttribute("href");
        driver.navigate().to(value2);
    }

    public void NewUserSignUpVisible() {
        // visibility moved to test via getter
    }

    public void setEmailAddressField(String emailAddressFieldtext) {
        driver.findElement(emailAddressField).sendKeys(emailAddressFieldtext);
    }

    public void setPasswordField(String passwordFieldtext) {
        driver.findElement(passwordField).sendKeys(passwordFieldtext);
    }

    public void setSignUpButton() {
        driver.findElement(signUpButton).click();
    }

    public void checkUserNameBar() {
        // visibility moved to test via getter
    }

    public void logoutButtonFun() {
        WebElement textField = driver.findElement(logoutButton);
        String value2 = textField.getAttribute("href");
        driver.navigate().to(value2);
    }

    // Getters for visibility assertions in tests
    public boolean isHomeCheckVisible() {
        return driver.findElement(homeCheck).isDisplayed();
    }

    public boolean isSignInAndSignUpButtonVisible() {
        return driver.findElement(singInAndSignUpButton).isDisplayed();
    }

    public boolean isNewUserSignUpVisible() {
        return driver.findElement(newUserSignUpVisible).isDisplayed();
    }

    public boolean isUserNameBarVisible() {
        return driver.findElement(usernameInBar).isDisplayed();
    }

    public boolean isLogoutButtonVisible() {
        return driver.findElement(logoutButton).isDisplayed();
    }
}
