package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductQuantityInCart {

    WebDriver driver;
    String quantity;

    public ProductQuantityInCart(WebDriver driver) {
        this.driver = driver;
    }

    By homeCheck = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[1]/a");
    By viewProduct = By.cssSelector("body > section:nth-child(3) > div > div > div.col-sm-9.padding-right > div.features_items > div:nth-child(3) > div > div.choose > ul > li > a");
    By productDetailIsOpened = By.cssSelector("body > section > div > div > div.col-sm-9.padding-right > div.product-details > div.col-sm-7 > div > img.newarrival");
    By firstProductQuantity = By.cssSelector("#quantity");
    By addToCartButton = By.cssSelector("body > section > div > div > div.col-sm-9.padding-right > div.product-details > div.col-sm-7 > div > span > button");
    By viewCartLink = By.cssSelector("#cartModal > div > div > div.modal-body > p:nth-child(2) > a");
    By quantityOfProductInCart = By.cssSelector("#product-1 > td.cart_quantity > button");

    public void HomeCheck() {
        // visibility moved to test via getter
    }

    public void clickOnViewProduct() {
        WebElement textField = driver.findElement(viewProduct);
        String value2 = textField.getAttribute("href");
        driver.navigate().to(value2);
    }

    public void verifyProductDetailIsOpened() {
        // visibility moved to test via getter
    }

    public void clickOnAddToCartFirstProduct() {
        WebElement elementToHover = driver.findElement(firstProductQuantity);
        Actions actions = new Actions(driver);
        quantity = "4";
        actions.moveToElement(elementToHover).perform();
        elementToHover.clear();
        elementToHover.sendKeys(quantity);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public void clickOnAddToCart() {
        driver.findElement(addToCartButton).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public void clickOnViewCart() {
        WebElement textField = driver.findElement(viewCartLink);
        String value2 = textField.getAttribute("href");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(textField));
        driver.navigate().to(value2);
    }

    public void verifyDetailsOfFirstProduct() {
        // moved to test via getters
    }

    // Getters for visibility assertions in tests
    public boolean isHomeCheckVisible() {
        return driver.findElement(homeCheck).isDisplayed();
    }

    public boolean isProductDetailOpenedVisible() {
        return driver.findElement(productDetailIsOpened).isDisplayed();
    }

    public String getSelectedQuantity() {
        return quantity;
    }

    public String getQuantityInCart() {
        return driver.findElement(quantityOfProductInCart).getText();
    }
}
