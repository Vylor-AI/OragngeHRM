package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegisterPage {

    WebDriver driver;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    By homeCheck = By.cssSelector("body > section:nth-child(3) > div > div > div.col-sm-9.padding-right > div.features_items > h2");
    By signInAndSignUpButton = By.cssSelector("#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(4) > a");
    By newUserSignUpVisible = By.cssSelector("#form > div > div > div:nth-child(3) > div > h2");
    By userNameField = By.cssSelector("#form > div > div > div:nth-child(3) > div > form > input[type=text]:nth-child(2)");
    By emailAddressField = By.cssSelector("#form > div > div > div:nth-child(3) > div > form > input[type=email]:nth-child(3)");
    By signupBtn = By.xpath("//button[@data-qa=\"signup-button\"]");
    By enterAccountInformation = By.cssSelector("#form > div > div > div > div.login-form > h2 > b");
    By mr = By.cssSelector("#id_gender1");
    By mrs = By.cssSelector("#id_gender2");
    By password = By.cssSelector("#password");
    By dayDate = By.cssSelector("#days");
    By monthDate = By.cssSelector("#months");
    By yearDate = By.cssSelector("#years");
    By newsLetter = By.cssSelector("#newsletter");
    By specialOffers = By.cssSelector("#optin");
    By firstName = By.cssSelector("#first_name");
    By lastName = By.cssSelector("#last_name");
    By companyName = By.cssSelector("#company");
    By addressField = By.cssSelector("#address1");
    By address2Field = By.cssSelector("#address2");
    By countryField = By.cssSelector("#country");
    By stateField = By.cssSelector("#state");
    By cityField = By.cssSelector("#city");
    By zipCode = By.cssSelector("#zipcode");
    By mobileNumber = By.cssSelector("#mobile_number");
    By createAccountButton = By.cssSelector("#form > div > div > div > div.login-form > form > button");
    By alreadyExistedUser = By.cssSelector("#form > div > div > div:nth-child(3) > div > form > p");
    By verifyAccountCreated = By.cssSelector("#form > div > div > div > h2 > b");
    By continueButton = By.cssSelector("#form > div > div > div > div > a");

    public void HomeCheck() {
        // visibility moved to test via getter
    }

    public void SingInAndSignUpButton() {
        WebElement textField = driver.findElement(signInAndSignUpButton);
        String value2 = textField.getAttribute("href");
        driver.navigate().to(value2);
    }

    public void NewUserSignUpVisible() {
        // visibility moved to test via getter
    }

    public void setUserName(String userName) {
        driver.findElement(userNameField).sendKeys(userName);
    }

    public void setEmailAddress(String emailAddress) {
        driver.findElement(emailAddressField).sendKeys(emailAddress);
    }

    public void setSignUpButton() {
        driver.findElement(signupBtn).click();
    }

    public void setEnterAccountInformation() {
        // visibility moved to test via getter
    }

    public void setMr() {
        driver.findElement(mr).click();
    }

    public void setMrs() {
        driver.findElement(mrs).click();
    }

    public void setPassword(String pass) {
        driver.findElement(password).sendKeys(pass);
    }

    public void setDayDate(String day) {
        Select daySelector = new Select(driver.findElement(dayDate));
        daySelector.selectByVisibleText(day);
    }

    public void setMonthDate(String month) {
        Select monthSelector = new Select(driver.findElement(monthDate));
        monthSelector.selectByVisibleText(month);
    }

    public void setYearDate(String year) {
        Select yearSelector = new Select(driver.findElement(yearDate));
        yearSelector.selectByVisibleText(year);
    }

    public void setNewsLetter() {
        driver.findElement(newsLetter).click();
    }

    public void setSpecialOffers() {
        driver.findElement(specialOffers).click();
    }

    public void setFirstName(String fName) {
        driver.findElement(firstName).sendKeys(fName);
    }

    public void setLastName(String lName) {
        driver.findElement(lastName).sendKeys(lName);
    }

    public void setCompanyName(String comName) {
        driver.findElement(companyName).sendKeys(comName);
    }

    public void setAddressField(String addressText) {
        driver.findElement(addressField).sendKeys(addressText);
    }

    public void setAddress2Field(String address2Text) {
        driver.findElement(address2Field).sendKeys(address2Text);
    }

    public void setCountryField(String countryFi) {
        Select selector = new Select(driver.findElement(countryField));
        selector.selectByVisibleText(countryFi);
    }

    public void setStateField(String stateFi) {
        driver.findElement(stateField).sendKeys(stateFi);
    }

    public void setCityField(String cityFi) {
        driver.findElement(cityField).sendKeys(cityFi);
    }

    public void setZipCode(String zipCodeFi) {
        driver.findElement(zipCode).sendKeys(zipCodeFi);
    }

    public void setMobileNumber(String mobileNumberText) {
        driver.findElement(mobileNumber).sendKeys(mobileNumberText);
    }

    public void setCreateAccountButton() {
        driver.findElement(createAccountButton).click();
    }

    public void registerWithExistedUser() {
        // visibility moved to test via getter
    }

    public void verifyAccountCreatedFun() {
        // visibility moved to test via getter
    }

    public void clickOnContinueButton() {
        WebElement textField = driver.findElement(continueButton);
        String value2 = textField.getAttribute("href");
        driver.navigate().to(value2);
    }

    // Getters for visibility assertions in tests
    public boolean isHomeCheckVisible() {
        return driver.findElement(homeCheck).isDisplayed();
    }

    public boolean isSignInAndSignUpButtonVisible() {
        return driver.findElement(signInAndSignUpButton).isDisplayed();
    }

    public boolean isNewUserSignUpVisible() {
        return driver.findElement(newUserSignUpVisible).isDisplayed();
    }

    public boolean isEnterAccountInformationVisible() {
        return driver.findElement(enterAccountInformation).isDisplayed();
    }

    public boolean isAlreadyExistedUserVisible() {
        return driver.findElement(alreadyExistedUser).isDisplayed();
    }

    public boolean isAccountCreatedVisible() {
        return driver.findElement(verifyAccountCreated).isDisplayed();
    }
}
