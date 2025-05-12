package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    By homeCheck = By.cssSelector("body > section:nth-child(3) > div > div > div.col-sm-9.padding-right > div.features_items > h2");
    By singInAndSignUpButton = By.cssSelector("#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(4) > a");
    //By newUserSignUpVisible = By.cssSelector("#form > div > div > div:nth-child(3) > div > h2");

    By emailAddressField = By.cssSelector("#form > div > div > div.col-sm-4.col-sm-offset-1 > div > form > input[type=email]:nth-child(2)");
    By passwordField = By.cssSelector("#form > div > div > div.col-sm-4.col-sm-offset-1 > div > form > input[type=password]:nth-child(3)");


    By signUpButton = By.cssSelector("#form > div > div > div.col-sm-4.col-sm-offset-1 > div > form > button");

    By usernameInBar = By.cssSelector("#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(10) > a > b");
    By delet = By.cssSelector("#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(5) > a");

    By checkDeleted = By.cssSelector("#form > div > div > div > h2 > b");

    By InvalidLoginMessage = By.cssSelector("#form > div > div > div.col-sm-4.col-sm-offset-1 > div > form > p");


    public void HomeCheck() {
        System.out.println(driver.findElement(homeCheck).isDisplayed());
    }

    public void SingInAndSignUpButton() {
        WebElement textField = driver.findElement(singInAndSignUpButton);
        String value2 = textField.getAttribute("href");
        driver.navigate().to(value2);
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

    public void checkUserNameBar(){
        driver.findElement(usernameInBar).isDisplayed();
    }

    public void deleteButton() {
        WebElement textField = driver.findElement(delet);
        String value2 = textField.getAttribute("href");
        driver.navigate().to(value2);
    }

    public void checkIsDeleted(){
        driver.findElement(checkDeleted).isDisplayed();
    }

    public void checkInValidLoginMessageVisability(){
        driver.findElement(InvalidLoginMessage).isDisplayed();
    }


}
