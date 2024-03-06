package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ComponentsProductPage extends BasePage {
    By addToBasket = By.xpath("(//button[@class ='btn-main'])[2]");
    public ComponentsProductPage(WebDriver driver) {
        super(driver);
    }
    public ComponentsProductPage addToBasket() {
        getWait20().until(ExpectedConditions.elementToBeClickable(addToBasket)).click();
        return new ComponentsProductPage(getDriver());
    }
}
