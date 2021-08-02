//Tự nghĩ ->>>> Quá pro
//Ấn nút lên/ xuống/ xang trái, xang phải

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

public class pressDOWN {
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

        //lấy toàn bộ page bằng body:  xpath: //body
        WebElement body_ele = driver.findElement(By.xpath("//body"));

        //Ấn nút xuống 10 lần, mỗi lần cách nhau 1,5s
        for(int i = 0; i<10; i++){
            body_ele.sendKeys(Keys.DOWN);
            Thread.sleep(1500);
        }

    }

    @AfterEach
    void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
