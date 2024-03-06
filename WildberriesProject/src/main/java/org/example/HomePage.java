package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {
    By wildberries = By.xpath("//a[@data-wba-header-name = 'Main']");
    public HomePage(WebDriver driver) {
        super(driver);
    }
    public ComponentsProductPage selectProduct(By locator) {
        getWait20().until(ExpectedConditions.elementToBeClickable(locator)).click();
        return new ComponentsProductPage(getDriver());
    }
    public HomePage selectWildberries() {
        getWait20().until(ExpectedConditions.elementToBeClickable(wildberries)).click();
        return new HomePage(getDriver());
    }
}
