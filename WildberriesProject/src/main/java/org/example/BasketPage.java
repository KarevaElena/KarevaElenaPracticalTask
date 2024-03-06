package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BasketPage extends BasePage {
    By basket = By.xpath("//a[@data-wba-header-name='Cart']");
    By name1 = By.xpath("(//span[@class='good-info__good-name'])[1]");
    By name2 = By.xpath("(//span[@class='good-info__good-name'])[2]");
    By number1 = By.xpath("(//input[@type= 'number'])[1]");
    By number2 = By.xpath("(//input[@type= 'number'])[2]");
    By price1 = By.xpath("(//div[@class= 'list-item__price-new wallet'])[1]");
    By price2 = By.xpath("(//div[@class= 'list-item__price-new wallet'])[1]");
    By totalPrice = By.xpath("//p[@class= 'b-top__total line']/span[2]/span");

    public BasketPage(WebDriver driver) {
        super(driver);
    }
    public BasketPage goToCart() {
        getWait20().until(ExpectedConditions.elementToBeClickable(basket)).click();
        return new BasketPage(getDriver());
    }
    public boolean checkProductName1() {
        String text = getWait20().until(ExpectedConditions.visibilityOfElementLocated(name1)).getText();
        //getDriver().findElement(name1).getText();
        return getWait20().until(ExpectedConditions.textToBePresentInElementLocated(name1,text));
    }
    public boolean checkProductName2() {
        String text = getWait20().until(ExpectedConditions.visibilityOfElementLocated(name2)).getText();
        return getWait20().until(ExpectedConditions.textToBePresentInElementLocated(name2,text));
    }
    public boolean checkProductQuantity1() {
        String text = getWait20().until(ExpectedConditions.visibilityOfElementLocated(number1)).getText();
        return getWait20().until(ExpectedConditions.textToBePresentInElementLocated(number1,text));
    }
    public boolean checkProductQuantity2() {
        String text = getWait20().until(ExpectedConditions.visibilityOfElementLocated(number2)).getText();
        return getWait20().until(ExpectedConditions.textToBePresentInElementLocated(number2,text));
    }
    public boolean checkProductPrice1() {
        String text = getWait20().until(ExpectedConditions.visibilityOfElementLocated(price1)).getText();
        return getWait20().until(ExpectedConditions.textToBePresentInElementLocated(price1,text));
    }
    public boolean checkProductPrice2() {
        String text = getWait20().until(ExpectedConditions.visibilityOfElementLocated(price2)).getText();
        return getWait20().until(ExpectedConditions.textToBePresentInElementLocated(price2,text));
    }
    public boolean checkProductTotalPrice() {
        String text = getWait20().until(ExpectedConditions.visibilityOfElementLocated(totalPrice)).getText();
        return getWait20().until(ExpectedConditions.textToBePresentInElementLocated(totalPrice,text));
    }
}
