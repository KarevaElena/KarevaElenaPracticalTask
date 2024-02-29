package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.time.Duration;

public class OnlineReplenishmentTest {
    private WebDriver driver;
    @BeforeMethod
    public void beforeMethod() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://www.mts.by/");
        driver.findElement(By.xpath("//button[@id = 'cookie-agree']")).click();

        Actions action = new Actions(driver);
        WebElement block = driver.findElement(By.xpath("//a[text() = 'Подробнее о сервисе']"));
        action.scrollToElement(block).build().perform();
    }
    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }
    @Test
    public void testCheckCommunicationServicesFieldPhone() {
        WebElement dropdown = driver.findElement(By.xpath("//span[@class = 'select__arrow']"));
        dropdown.click();

        WebElement communicationServices = driver.findElement(By.xpath("//li[@class = 'select__item active']/p"));
        communicationServices.click();

        Assert.assertTrue(driver.findElement(By.xpath("//input[@placeholder = 'Номер телефона']")).isDisplayed());
    }
    @Test
    public void testCheckCommunicationServicesFieldAmount() {
        WebElement dropdown = driver.findElement(By.xpath("//span[@class = 'select__arrow']"));
        dropdown.click();

        WebElement communicationServices = driver.findElement(By.xpath("//li[@class = 'select__item active']/p"));
        communicationServices.click();

        Assert.assertTrue(driver.findElement(By.xpath("//form[@id = 'pay-connection']//input[@placeholder = 'Сумма']")).isDisplayed());
    }
    @Test
    public void testCheckCommunicationServicesFieldEmail() {
        WebElement dropdown = driver.findElement(By.xpath("//span[@class = 'select__arrow']"));
        dropdown.click();

        WebElement communicationServices = driver.findElement(By.xpath("//li[@class = 'select__item active']/p"));
        communicationServices.click();

        Assert.assertTrue(driver.findElement(By.xpath("//form[@id = 'pay-connection']//input[@placeholder = 'E-mail для отправки чека']")).isDisplayed());
    }
    @Test
    public void testCheckYourHomeInternetNumber() {
        WebElement dropdown = driver.findElement(By.xpath("//span[@class = 'select__arrow']"));
        dropdown.click();

        WebElement homeInternet = driver.findElement(By.xpath("//p[text() = 'Домашний интернет']"));
        homeInternet.click();

        Assert.assertTrue(driver.findElement(By.xpath("//input[@placeholder = 'Номер абонента']")).isDisplayed());
    }
    @Test
    public void testCheckHomeInternetAmount() {
        WebElement dropdown = driver.findElement(By.xpath("//span[@class = 'select__arrow']"));
        dropdown.click();

        WebElement homeInternet = driver.findElement(By.xpath("//p[text() = 'Домашний интернет']"));
        homeInternet.click();

        Assert.assertTrue(driver.findElement(By.xpath("//form[@id = 'pay-internet']//input[@placeholder = 'Сумма']")).isDisplayed());
    }
    @Test
    public void testCheckHomeInternetFieldEmail() {
        WebElement dropdown = driver.findElement(By.xpath("//span[@class = 'select__arrow']"));
        dropdown.click();

        WebElement homeInternet = driver.findElement(By.xpath("//p[text() = 'Домашний интернет']"));
        homeInternet.click();

        Assert.assertTrue(driver.findElement(By.xpath("//form[@id = 'pay-internet']//input[@placeholder = 'E-mail для отправки чека']")).isDisplayed());
    }
    @Test
    public void testCheckInstallmentAccountNumber() {
        WebElement dropdown = driver.findElement(By.xpath("//span[@class = 'select__arrow']"));
        dropdown.click();

        WebElement installmentPlan = driver.findElement(By.xpath("//p[text() = 'Рассрочка']"));
        installmentPlan.click();

        Assert.assertTrue(driver.findElement(By.xpath("//input[@placeholder = 'Номер счета на 44']")).isDisplayed());
    }
    @Test
    public void testCheckInstallmentAmount() {
        WebElement dropdown = driver.findElement(By.xpath("//span[@class = 'select__arrow']"));
        dropdown.click();

        WebElement installmentPlan = driver.findElement(By.xpath("//p[text() = 'Рассрочка']"));
        installmentPlan.click();

        Assert.assertTrue(driver.findElement(By.xpath("//form[@id = 'pay-instalment']//input[@placeholder = 'Сумма']")).isDisplayed());
    }
    @Test
    public void testCheckInstallmentEmail() {
        WebElement dropdown = driver.findElement(By.xpath("//span[@class = 'select__arrow']"));
        dropdown.click();

        WebElement installmentPlan = driver.findElement(By.xpath("//p[text() = 'Рассрочка']"));
        installmentPlan.click();

        Assert.assertTrue(driver.findElement(By.xpath("//form[@id = 'pay-instalment']//input[@placeholder = 'E-mail для отправки чека']")).isDisplayed());
    }
    @Test
    public void testCheckDebtAccountNumber() {
        WebElement dropdown = driver.findElement(By.xpath("//span[@class = 'select__arrow']"));
        dropdown.click();

        WebElement debt = driver.findElement(By.xpath("//p[text() = 'Задолженность']"));
        debt.click();

        Assert.assertTrue(driver.findElement(By.xpath("//input[@placeholder = 'Номер счета на 2073']")).isDisplayed());
    }
    @Test
    public void testCheckDebtAmount() {
        WebElement dropdown = driver.findElement(By.xpath("//span[@class = 'select__arrow']"));
        dropdown.click();

        WebElement debt = driver.findElement(By.xpath("//p[text() = 'Задолженность']"));
        debt.click();

        Assert.assertTrue(driver.findElement(By.xpath("//form[@id = 'pay-connection']//input[@placeholder = 'Сумма']")).isDisplayed());
    }
    @Test
    public void testCheckDebtEmail() {
        WebElement dropdown = driver.findElement(By.xpath("//span[@class = 'select__arrow']"));
        dropdown.click();

        WebElement debt = driver.findElement(By.xpath("//p[text() = 'Задолженность']"));
        debt.click();

        Assert.assertTrue(driver.findElement(By.xpath("//form[@id = 'pay-connection']//input[@placeholder = 'E-mail для отправки чека']")).isDisplayed());
    }
    @Test
    public void testCheckAmountDisplay() {
        WebElement dropdown = driver.findElement(By.xpath("//span[@class = 'select__arrow']"));
        dropdown.click();

        WebElement communicationServices = driver.findElement(By.xpath("//li[@class = 'select__item active']/p"));
        communicationServices.click();

        WebElement telephone = driver.findElement(By.id("connection-phone"));
        telephone.click();
        telephone.sendKeys("297777777");

        WebElement sum = driver.findElement(By.id("connection-sum"));
        sum.click();
        sum.sendKeys("300");

        WebElement button = driver.findElement(By.xpath("//form[@class = 'pay-form opened']//button"));
        button.click();

        WebElement iframe = driver.findElement(By.cssSelector(".bepaid-app__container>iframe"));
        driver.switchTo().frame(iframe);

        WebElement summa = driver.findElement(By.xpath("//span[text() = '300.00 BYN']"));

        Assert.assertTrue(summa.isDisplayed());
    }
}
