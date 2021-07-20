//Kiểm tra element đã được select hay chưa?
//Udemy - 48

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

class isSelected_Test {

    WebDriver driver;
    String url;

    @BeforeEach
    void setUp() {
        //create driver
        driver = new ChromeDriver();
        url = "https://courses.letskodeit.com/practice";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(url);
    }

    @Test
    void Selected() throws InterruptedException {

        //find Benz Checkbox
        WebElement benz_check = driver.findElement(By.id("benzcheck"));
        benz_check.click();

        //kiểm tra element benz_check có được select hay thông qua : isSelected()
        System.out.println("Benz checkbox: " + benz_check.isSelected());
    }

    @AfterEach
    void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}