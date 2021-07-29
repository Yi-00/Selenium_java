//Udemy - 45

package JUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class Click_Clear_Test {

    WebDriver driver;
    String url = "https://opensource-demo.orangehrmlive.com/";

    @BeforeEach
    void setUp() {
        //create driver

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //waiting 10 second
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    void test_1(){
        driver.get(url);
        //find username
        WebElement ac_ele = driver.findElement(By.id("txtUsername"));
        ac_ele.clear();
        ac_ele.sendKeys("Admin");

        //find password
        WebElement pw_ele = driver.findElement(By.id("txtPassword"));
        pw_ele.clear();
        pw_ele.sendKeys("admin123");

        //find login button
        driver.findElement(By.id("btnLogin")).click();

    }

    @AfterEach
    void tearDown() {
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.close();
        driver.quit();
    }
}