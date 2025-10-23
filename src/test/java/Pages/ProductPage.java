package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class ProductPage {

    WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }


    By homeCheck = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[1]/a");
    By productsButton = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a");
    By verifyProductsButton = By.xpath("/html/body/section[2]/div/div/div[2]/div/h2");

    By verifyProductsListVisable = By.xpath("/html/body/section[2]/div/div/div[2]");

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
        System.out.println(driver.findElement(homeCheck).isDisplayed());
    }

    public void productsButtonFun() {
        WebElement textField = driver.findElement(productsButton);
        String value2 = textField.getAttribute("href");
        driver.navigate().to(value2);
    }

    public void verifyProductsButtonFun(){
        System.out.println(driver.findElement(verifyProductsButton).isDisplayed());
    }

    public void verifyProductsVisableFun(){
        System.out.println(driver.findElement(verifyProductsListVisable).isDisplayed());
    }

    public void clickOnViewProductFun(){
        WebElement textField = driver.findElement(clickOnViewProduct);
        String value2 = textField.getAttribute("href");
        driver.navigate().to(value2);
    }

    public void checkNavigationIntoRightProductFun(){
        System.out.println(driver.findElement(checkNavigationIntoRightProduct).isDisplayed());
    }

    public void checkDetailsOfFirstProduct(){
        // navigation to the first product’s details is handled by test assertions in TestPages
    }

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

    public void addValueToSearchBar(String product){
        driver.findElement(searchBar).sendKeys(product);
    }

    public void clickOnSearchButton(){
        driver.findElement(getSearchButton).click();
    }

    public void verifySearchedProductFun(){
        System.out.println(driver.findElement(verifySearchedProduct).isDisplayed());
    }

    public void getRelatedSearchProductsFun(){
        System.out.println(driver.findElement(relatedSearchProducts).isDisplayed());
    }


}
