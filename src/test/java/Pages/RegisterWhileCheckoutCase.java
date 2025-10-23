package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegisterWhileCheckoutCase {

    WebDriver driver;

    public RegisterWhileCheckoutCase(WebDriver driver) {
        this.driver = driver;
    }

    By homeCheck = By.cssSelector("body > section:nth-child(3) > div > div > div.col-sm-9.padding-right > div.features_items > h2");
    By selectFirstProduct = By.cssSelector("body > section:nth-child(3) > div > div > div.col-sm-9.padding-right > div.features_items > div:nth-child(3) > div > div.single-products > div.productinfo.text-center > img");
    By hoverOnFirstProduct = By.cssSelector("body > section:nth-child(3) > div > div > div.col-sm-9.padding-right > div.features_items > div:nth-child(3) > div > div.single-products > div.product-overlay > div");
    By continueShopping = By.cssSelector(".modal-footer .btn-success");
    By selectSecondProduct = By.cssSelector("body > section:nth-child(3) > div > div > div.col-sm-9.padding-right > div.features_items > div:nth-child(4) > div > div.single-products > div.productinfo.text-center > img");
    By hoverOnSecondProduct = By.cssSelector("body > section:nth-child(3) > div > div > div.col-sm-9.padding-right > div.features_items > div:nth-child(4) > div > div.single-products > div.product-overlay > div");
    By cartButton = By.cssSelector("#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(3) > a");
    By verifyCartPage = By.cssSelector("#cart_items > div > div.breadcrumbs > ol > li.active");
    By proceedToCheckout = By.cssSelector("#do_action > div.container > div > div > a");
    By registerOrLogin = By.cssSelector("#checkoutModal > div > div > div.modal-body > p:nth-child(2) > a");
    By userNameField = By.cssSelector("#form > div > div > div:nth-child(3) > div > form > input[type=text]:nth-child(2)");
    By emailAddressField = By.cssSelector("#form > div > div > div:nth-child(3) > div > form > input[type=email]:nth-child(3)");
    By signUpButton = By.cssSelector("#form > div > div > div:nth-child(3) > div > form > button");
    By mr = By.cssSelector("#id_gender1");
    By mrs = By.cssSelector("#id_gender2");
    By password = By.cssSelector("#password");
    By dayDate = By.cssSelector("#days");
    By monthDate = By.cssSelector("#months");
    By yearDate = By.cssSelector("#years");
    By newsletter = By.cssSelector("#newsletter");
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
    By newUserSignUpVisible = By.cssSelector("#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(10) > a > b");
    By addressDetails = By.cssSelector("#cart_items > div > div:nth-child(2) > h2");
    By reviewYourOrder = By.cssSelector("#cart_items > div > div:nth-child(4) > h2");
    By textArea = By.cssSelector("#ordermsg > textarea");
    By placeOrder = By.cssSelector("#cart_items > div > div:nth-child(7) > a");
    By nameOnCard = By.cssSelector("#payment-form > div:nth-child(2) > div > input");
    By cardNumber = By.cssSelector("#payment-form > div:nth-child(3) > div > input");
    By cvc = By.cssSelector("#payment-form > div:nth-child(4) > div.col-sm-4.form-group.cvc > input");
    By expirationMonth = By.cssSelector("#payment-form > div:nth-child(4) > div:nth-child(2) > input");
    By expirationYear = By.cssSelector("#payment-form > div:nth-child(4) > div:nth-child(3) > input");
    By payAndConfirmOrder = By.cssSelector("#submit");
    By successMessage = By.cssSelector("#success_message > div");
    By deleteLink = By.cssSelector("#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(5) > a");
    By checkDeleted = By.cssSelector("#form > div > div > div > h2 > b");

    public void HomeCheck() {
        // visibility moved to test via getter
    }

    public void clickOnAddToCartFirstProduct() {
        WebElement hover = driver.findElement(selectFirstProduct);
        WebElement clickElem = driver.findElement(hoverOnFirstProduct);
        new Actions(driver).moveToElement(hover).perform();
        new WebDriverWait(driver, Duration.ofSeconds(10))
            .until(ExpectedConditions.elementToBeClickable(clickElem));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public void goToContinueShopping() {
        new WebDriverWait(driver, Duration.ofSeconds(20))
            .until(ExpectedConditions.elementToBeClickable(continueShopping))
            .click();
    }

    public void clickOnAddToCartSecondProduct() {
        WebElement hover = driver.findElement(selectSecondProduct);
        WebElement clickElem = driver.findElement(hoverOnSecondProduct);
        new Actions(driver).moveToElement(hover).perform();
        clickElem.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public void goToCartPage() {
        driver.navigate().to(driver.findElement(cartButton).getAttribute("href"));
    }

    public void verifyCartPageFun() {
        // visibility moved to test via getter
    }

    public void proceedToCheckout() {
        driver.navigate().to(driver.findElement(proceedToCheckout).getAttribute("href"));
    }

    public void registerOrLogin() {
        driver.navigate().to(driver.findElement(registerOrLogin).getAttribute("href"));
    }

    public void setUserName(String user) { driver.findElement(userNameField).sendKeys(user); }
    public void setEmailAddress(String email) { driver.findElement(emailAddressField).sendKeys(email); }
    public void setSignUpButton() { driver.findElement(signUpButton).click(); }
    public void setMr() { driver.findElement(mr).click(); }
    public void setMrs() { driver.findElement(mrs).click(); }
    public void setPassword(String pass) { driver.findElement(password).sendKeys(pass); }
    public void setDayDate(String day) { new Select(driver.findElement(dayDate)).selectByVisibleText(day); }
    public void setMonthDate(String mon) { new Select(driver.findElement(monthDate)).selectByVisibleText(mon); }
    public void setYearDate(String yr) { new Select(driver.findElement(yearDate)).selectByVisibleText(yr); }
    public void setNewsletter() { driver.findElement(newsletter).click(); }
    public void setSpecialOffers() { driver.findElement(specialOffers).click(); }
    public void setFirstName(String fn) { driver.findElement(firstName).sendKeys(fn); }
    public void setLastName(String ln) { driver.findElement(lastName).sendKeys(ln); }
    public void setCompanyName(String cn) { driver.findElement(companyName).sendKeys(cn); }
    public void setAddressField(String addr) { driver.findElement(addressField).sendKeys(addr); }
    public void setAddress2Field(String addr2) { driver.findElement(address2Field).sendKeys(addr2); }
    public void setCountryField(String cty) { new Select(driver.findElement(countryField)).selectByVisibleText(cty); }
    public void setStateField(String st) { driver.findElement(stateField).sendKeys(st); }
    public void setCityField(String c) { driver.findElement(cityField).sendKeys(c); }
    public void setZipCode(String zip) { driver.findElement(zipCode).sendKeys(zip); }
    public void setMobileNumber(String mn) { driver.findElement(mobileNumber).sendKeys(mn); }
    public void setCreateAccountButton() { driver.findElement(createAccountButton).click(); }

    public void verifyNewUserCreated() {
        // visibility moved to test via getter
    }

    public void clickOnDelete() { driver.findElement(deleteLink).click(); }

    public void verifyCheckDeleted() {
        // visibility moved to test via getter
    }

    // Getters for visibility assertions in tests
    public boolean isHomeCheckVisible() {
        return driver.findElement(homeCheck).isDisplayed();
    }

    public boolean isCartPageVisible() {
        return driver.findElement(verifyCartPage).isDisplayed();
    }

    public boolean isNewUserSignUpVisible() {
        return driver.findElement(newUserSignUpVisible).isDisplayed();
    }

    public boolean isAddressDetailsVisible() {
        return driver.findElement(addressDetails).isDisplayed();
    }

    public boolean isReviewYourOrderVisible() {
        return driver.findElement(reviewYourOrder).isDisplayed();
    }

    public boolean isSuccessMessageVisible() {
        return driver.findElement(successMessage).isDisplayed();
    }

    public boolean isCheckDeletedVisible() {
        return driver.findElement(checkDeleted).isDisplayed();
    }
}