//Udemy-56    : getText()   : lấy text

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

class getText {
    WebDriver driver;
    String url;

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    void getText() throws InterruptedException {
        //Load url
        Thread.sleep(2000);
        url = "https://courses.letskodeit.com/practice";
        driver.get(url);

        //Find element
        WebElement ele = driver.findElement(By.xpath("//*[@id=\"page\"]/div[2]/div[2]/div/div/div/div/h1"));

        //Display text
        System.out.println(ele.getText());

    }

    @AfterEach
    void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}