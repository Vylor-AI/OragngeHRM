package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage {

    WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    By homeCheck = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[1]/a");
    By productsButton = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a");
    By verifyProductsButton = By.xpath("/html/body/section[2]/div/div/div[2]/div/h2");
    By verifyProductsListVisible = By.xpath("/html/body/section[2]/div/div/div[2]");
    By clickOnViewProduct = By.xpath("/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[2]/ul/li/a");
    By checkNavigationIntoRightProduct = By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/h2");
    By productName = By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/h2");
    By productCategory = By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[1]");
    By productPrice = By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/span");
    By productAvailability = By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[2]/b");
    By productCondition = By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[3]/b");
    By productBrand = By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[4]/b");
    By searchBar = By.xpath("//*[@id=\"search_product\"]");
    By getSearchButton = By.xpath("//*[@id=\"search_product\"]");
    By verifySearchedProduct = By.xpath("/html/body/section[2]/div/div/div[2]/div/h2");
    By relatedSearchProducts = By.xpath("/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[1]/div[1]/p");

    public void HomeCheck() {
        // visibility moved to test via getter
    }

    public void productsButtonFun() {
        WebElement textField = driver.findElement(productsButton);
        String value2 = textField.getAttribute("href");
        driver.navigate().to(value2);
    }

    public void verifyProductsButtonFun() {
        // visibility moved to test via getter
    }

    public void verifyProductsListVisibleFun() {
        // visibility moved to test via getter
    }

    public void clickOnViewProductFun() {
        WebElement textField = driver.findElement(clickOnViewProduct);
        String value2 = textField.getAttribute("href");
        driver.navigate().to(value2);
    }

    public void checkNavigationIntoRightProductFun() {
        // visibility moved to test via getter
    }

    public void addValueToSearchBar(String product) {
        driver.findElement(searchBar).sendKeys(product);
    }

    public void clickOnSearchButton() {
        driver.findElement(getSearchButton).click();
    }

    public void verifySearchedProductFun() {
        // visibility moved to test via getter
    }

    public void getRelatedSearchProductsFun() {
        // visibility moved to test via getter
    }

    // Getters for visibility assertions in tests
    public boolean isHomeCheckVisible() {
        return driver.findElement(homeCheck).isDisplayed();
    }

    public boolean isVerifyProductsButtonVisible() {
        return driver.findElement(verifyProductsButton).isDisplayed();
    }

    public boolean isProductsListVisible() {
        return driver.findElement(verifyProductsListVisible).isDisplayed();
    }

    public boolean isNavigationIntoRightProductVisible() {
        return driver.findElement(checkNavigationIntoRightProduct).isDisplayed();
    }

    public boolean isVerifySearchedProductVisible() {
        return driver.findElement(verifySearchedProduct).isDisplayed();
    }

    public boolean isRelatedSearchProductsVisible() {
        return driver.findElement(relatedSearchProducts).isDisplayed();
    }

    // Getters for product detail assertions
    public String getProductName() {
        return driver.findElement(productName).getText();
    }

    public String getProductCategory() {
        return driver.findElement(productCategory).getText();
    }

    public String getProductPrice() {
        return driver.findElement(productPrice).getText();
    }

    public String getProductAvailability() {
        return driver.findElement(productAvailability).getText();
    }

    public String getProductCondition() {
        return driver.findElement(productCondition).getText();
    }

    public String getProductBrand() {
        return driver.findElement(productBrand).getText();
    }
}
