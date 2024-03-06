package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WildberriesTest {
    By product1 = By.xpath("(//div[@class ='product-card__wrapper'])[1]");
    By product2 = By.xpath("(//div[@class ='product-card__wrapper'])[2]");
    private WebDriver driver;
    private ChromeOptions chromeOptions;

    public ChromeOptions getChromeOptions() {
        chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--window-size=1920,1080");
        return chromeOptions;
    }

    public WebDriver getDriver() {
        if (driver == null) {
            driver = new ChromeDriver(getChromeOptions());
        }
        return driver;
    }
    @BeforeMethod
    private void beforeMethod() {
        getDriver().get("https://www.wildberries.ru");
    }
    @AfterMethod
    private void afterMethod() {
        getDriver().quit();
    }
    @Test
    public void testCheckProductName() {
        new HomePage(getDriver())
                .selectProduct(product1)
                .addToBasket();
        new HomePage(getDriver())
                .selectWildberries()
                .selectProduct(product2)
                .addToBasket();
        new BasketPage(getDriver()).goToCart();
        Assert.assertTrue(new BasketPage(getDriver()).checkProductName1());
        Assert.assertTrue(new BasketPage(getDriver()).checkProductName2());
    }
    @Test
    public void testCheckQuantity() {
        new HomePage(getDriver())
                .selectProduct(product1)
                .addToBasket();
        new HomePage(getDriver())
                .selectWildberries()
                .selectProduct(product2)
                .addToBasket();
        new BasketPage(getDriver()).goToCart();
        Assert.assertTrue(new BasketPage(getDriver()).checkProductQuantity1());
        Assert.assertTrue(new BasketPage(getDriver()).checkProductQuantity2());
    }
    @Test
    public void testCheckPrice() {
        new HomePage(getDriver())
                .selectProduct(product1)
                .addToBasket();
        new HomePage(getDriver())
                .selectWildberries()
                .selectProduct(product2)
                .addToBasket();
        new BasketPage(getDriver()).goToCart();
        Assert.assertTrue(new BasketPage(getDriver()).checkProductPrice1());
        Assert.assertTrue(new BasketPage(getDriver()).checkProductPrice2());
    }
    @Test
    public void testCheckTotalPrice() {
        new HomePage(getDriver())
                .selectProduct(product1)
                .addToBasket();
        new HomePage(getDriver())
                .selectWildberries()
                .selectProduct(product2)
                .addToBasket();
        new BasketPage(getDriver()).goToCart();
        Assert.assertTrue(new BasketPage(getDriver()).checkProductTotalPrice());
    }
}
