package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductWithCart {
    WebDriver driver;

    public ProductWithCart(WebDriver driver) {
        this.driver = driver;
    }

    By homeCheck = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[1]/a");
    By productsButton = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a");

    By selectFirstProduct = By.xpath("/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[1]/div[1]/img");
    By selectSecondProduct = By.xpath("/html/body/section[2]/div/div/div[2]/div/div[3]/div/div[1]/div[1]/img");

    By hoverOnFirstProduct = By.xpath("/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[1]/div[2]/div");
    By hoverOnSecondProduct = By.xpath("/html/body/section[2]/div/div/div[2]/div/div[3]/div/div[1]/div[2]/div");

    By continueShopping = By.xpath("/html/body/section[2]/div/div/div[2]/div/div[1]/div/div/div[3]/button");
    By viewCartLink = By.xpath("(//a[@href=\"/view_cart\"])[2]");

    By firstProductAddedToCart = By.cssSelector("#product-1 > td.cart_description > p");
    By secondProductAddedToCart = By.cssSelector("#product-2 > td.cart_description > h4 > a");

    By firstProductPriceInCartPage = By.cssSelector("#product-1 > td.cart_price > p");
    By firstProductQuantityInCartPage = By.cssSelector("#product-1 > td.cart_quantity > button");
    By firstProductTotalPriceInCartPage = By.cssSelector("#product-1 > td.cart_total > p");

    By secondProductPriceInCartPage = By.cssSelector("#product-2 > td.cart_price > p");
    By secondProductQuantityInCartPage = By.cssSelector("#product-2 > td.cart_quantity > button");
    By secondProductTotalPriceInCartPage = By.cssSelector("#product-2 > td.cart_total > p");

    By hoverProductFromHome = By.xpath("//img[@src=\"/get_product_picture/2\"]");
    By clickAddToCartHome = By.xpath("(//a[@data-product-id=\"2\"])[2]");

    By verifyCartPage = By.xpath("//td[@class=\"image\"]");
    By deleteProductFromCart = By.xpath("//a[@class=\"cart_quantity_delete\"]");

    By verifyCartEmpty = By.xpath("//span[@id=\"empty_cart\"]");

    public void HomeCheck() {
        // visibility moved to test via getter
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 500);");
    }

    public void goToProductsPage() {
        WebElement textField = driver.findElement(productsButton);
        driver.navigate().to(textField.getAttribute("href"));
    }

    public void clickOnAddToCartFirstProduct() {
        WebElement elementToHover = driver.findElement(selectFirstProduct);
        WebElement elementToClick = driver.findElement(hoverOnFirstProduct);
        Actions actions = new Actions(driver);
        actions.moveToElement(elementToHover).perform();
        new WebDriverWait(driver, Duration.ofSeconds(20))
            .until(ExpectedConditions.elementToBeClickable(elementToClick));
        elementToClick.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public void clickOnAddToCartSecondProduct() {
        WebElement elementToHover = driver.findElement(selectSecondProduct);
        WebElement elementToClick = driver.findElement(hoverOnSecondProduct);
        Actions actions = new Actions(driver);
        actions.moveToElement(elementToHover).perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        elementToClick.click();
    }

    public void goToContinueShopping() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
            .until(ExpectedConditions.elementToBeClickable(continueShopping))
            .click();
    }

    public void goToCart() {
        WebElement textField = driver.findElement(viewCartLink);
        driver.navigate().to(textField.getAttribute("href"));
    }

    public void chooseProductFromHome() {
        WebElement elementToHover = driver.findElement(hoverProductFromHome);
        Actions actions = new Actions(driver);
        actions.moveToElement(elementToHover).perform();
        new WebDriverWait(driver, Duration.ofSeconds(30))
            .until(ExpectedConditions.elementToBeClickable(clickAddToCartHome))
            .click();
    }

    public void deleteProductFromCart() {
        driver.findElement(deleteProductFromCart).click();
    }

    // Getters for visibility assertions in tests
    public boolean isHomeCheckVisible() {
        return driver.findElement(homeCheck).isDisplayed();
    }

    public boolean isFirstProductAddedToCartVisible() {
        return driver.findElement(firstProductAddedToCart).isDisplayed();
    }

    public boolean isSecondProductAddedToCartVisible() {
        return driver.findElement(secondProductAddedToCart).isDisplayed();
    }

    public boolean isFirstProductPriceVisible() {
        return driver.findElement(firstProductPriceInCartPage).isDisplayed();
    }

    public boolean isFirstProductQuantityVisible() {
        return driver.findElement(firstProductQuantityInCartPage).isDisplayed();
    }

    public boolean isFirstProductTotalPriceVisible() {
        return driver.findElement(firstProductTotalPriceInCartPage).isDisplayed();
    }

    public boolean isSecondProductPriceVisible() {
        return driver.findElement(secondProductPriceInCartPage).isDisplayed();
    }

    public boolean isSecondProductQuantityVisible() {
        return driver.findElement(secondProductQuantityInCartPage).isDisplayed();
    }

    public boolean isSecondProductTotalPriceVisible() {
        return driver.findElement(secondProductTotalPriceInCartPage).isDisplayed();
    }

    public boolean isCartPageVisible() {
        return driver.findElement(verifyCartPage).isDisplayed();
    }

    public boolean isCartEmptyVisible() {
        return driver.findElement(verifyCartEmpty).isDisplayed();
    }
}
