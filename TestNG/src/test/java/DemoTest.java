import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.nio.Buffer;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.*;

public class DemoTest {
    WebDriver driver;
    String xpathIframe = "//div[@class='paypal-smart-button dynamic-checkout__logo']//iframe[1]";
    String xpath1 ="//div[@role='button']";
    String url1 = "https://quan.stag.myshopbase.net/products/shirt";
    String url2 = "https://quan.stag.myshopbase.net/checkouts/bedeaf22cfb241ec9315166578573401?step=contact_information";

    String xpathAddToCart = "//button[@type='button']//span[normalize-space()='Add to cart']";

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void test() throws InterruptedException {
        driver.get(url1);

//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathAddToCart))).click();

        WebElement eleIframe = driver.findElement(By.xpath(xpathIframe));
        driver.switchTo().frame(eleIframe);
        System.out.println("pass1");

        WebDriverWait wait = new WebDriverWait(driver, 120);
        WebElement eleBtn = driver.findElement(By.xpath(xpath1));
//        System.out.println(eleBtn.isDisplayed());
//        System.out.println(eleBtn.isEnabled());

        wait.until(ExpectedConditions.elementToBeClickable(eleBtn));
        eleBtn.click();

        System.out.println("pass2");
        driver.switchTo().defaultContent();
        Thread.sleep(3000);
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}