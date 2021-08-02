//Udemy: 86
//Mô phỏng các thao tác với bàn phím: Ctrl + V, Enter,.....

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

public class pressEnter {
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
    void keyPress() throws InterruptedException {
        //Load url
        driver.get(url);
        Thread.sleep(3000);

        WebElement search_ele = driver.findElement(By.xpath("//input[contains(@id,\"search_query_top\")]"));
        search_ele.sendKeys("T-shirt");
        Thread.sleep(3000);
        search_ele.sendKeys(Keys.ENTER);        //press Enter on the keyboard
    }

    @AfterEach
    void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
