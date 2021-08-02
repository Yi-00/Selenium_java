package Keyboard;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Ctrl {
    WebDriver driver;
    String url;

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        url = "http://automationpractice.com/index.php";

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    void testCtrl() throws InterruptedException {
        driver.get(url);
        Thread.sleep(3000);

        WebElement search_ele = driver.findElement(By.xpath("//input[contains(@id,\"search_query_top\")]"));
        search_ele.sendKeys("aaa");
        Thread.sleep(2000);
        //Ctrl + ...
        search_ele.sendKeys(Keys.CONTROL,"a");   //Ctrl + A: select all
        Thread.sleep(2000);
        search_ele.sendKeys(Keys.CONTROL,"C");   //Ctrl + C: copy all
        Thread.sleep(2000);
        search_ele.sendKeys(Keys.CONTROL,"x");   //Ctrl + X: delete
    }

    @AfterEach
    void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
