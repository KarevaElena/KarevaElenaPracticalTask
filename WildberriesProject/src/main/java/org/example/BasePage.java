package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public abstract class BasePage {
    private final WebDriver driver;
    private WebDriverWait wait20;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    protected WebDriver getDriver() {
        return driver;
    }
    public WebDriverWait getWait20() {
        if (wait20 == null) {
            wait20 = new WebDriverWait(getDriver(), Duration.ofSeconds(20));
        }
        return wait20;
    }
}
