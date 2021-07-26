//Udemy - 58 : 11p

package Useful_Method;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class GenericMethod_Demo {
    private WebDriver driver;
    private String url;
    private GenericMethod gm;


    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        url = "https://courses.letskodeit.com/practice";
        gm = new GenericMethod(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    void testMethod() throws InterruptedException {
        Thread.sleep(3000);
        driver.get(url);
        WebElement ele = (WebElement) gm.getElement("id","openwindow");     //findElement(By.id("openwindow")
        ele.click();
    }

    @AfterEach
    void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
        Thread.sleep(3000);
        driver.quit();
    }
}