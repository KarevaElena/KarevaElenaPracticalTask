package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.List;


public class MtsTest {
    public boolean buttonOperation(WebElement element) {
        element.click();
        return true;
    }
    @Test
    public void testCheckBlockName() {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        driver.get("https://www.mts.by/");
        driver.findElement(By.xpath("//button[@id = 'cookie-agree']")).click();

        Actions action = new Actions(driver);
        WebElement block = driver.findElement(By.xpath("//a[text() = 'Подробнее о сервисе']"));
        action.scrollToElement(block).build().perform();

        Assert.assertEquals(driver.findElement(By.xpath("//div[@class = 'pay__wrapper']/h2")).getText(), "Онлайн пополнение\n" + "без комиссии");

        driver.quit();
    }
    @Test
    public void testCheckForLogos() {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://www.mts.by/");
        driver.findElement(By.xpath("//button[@id = 'cookie-agree']")).click();

        Actions action = new Actions(driver);
        WebElement block = driver.findElement(By.xpath("//a[text() = 'Подробнее о сервисе']"));
        action.scrollToElement(block).build().perform();

        WebElement element = driver.findElement(By.xpath("//div[@class = 'pay__partners']/ul"));
        List<WebElement> logos = element.findElements(By.tagName("li"));
        for (WebElement logo : logos) {
            Assert.assertTrue(logo.isDisplayed());
        }

        driver.quit();
    }
    @Test
    public void testCheckTheLinkWorks() {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://www.mts.by/");
        driver.findElement(By.xpath("//button[@id = 'cookie-agree']")).click();

        Actions action = new Actions(driver);
        WebElement block = driver.findElement(By.xpath("//a[text() = 'Подробнее о сервисе']"));
        action.scrollToElement(block).build().perform();

        driver.findElement(By.xpath("//a[text() = 'Подробнее о сервисе']")).click();

        Assert.assertEquals(driver.findElement(By.xpath("//div[@class ='wrapper']//h3[1]")).getText(),
                "Оплата банковской картой");

        driver.quit();
    }
    @Test
    public void testCheckButton() {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://www.mts.by/");
        driver.findElement(By.xpath("//button[@id = 'cookie-agree']")).click();

        Actions action = new Actions(driver);
        WebElement block = driver.findElement(By.xpath("//a[text() = 'Подробнее о сервисе']"));
        action.scrollToElement(block).build().perform();

        WebElement telephone = driver.findElement(By.id("connection-phone"));
        telephone.click();
        telephone.sendKeys("297777777");

        WebElement sum = driver.findElement(By.id("connection-sum"));
        sum.click();
        sum.sendKeys("300");

        WebElement button = driver.findElement(By.xpath("//form[@class = 'pay-form opened']//button"));

        Assert.assertTrue(buttonOperation(button));

        driver.quit();
    }
}
