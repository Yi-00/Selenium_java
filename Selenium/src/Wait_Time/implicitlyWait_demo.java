//Udemy : 63

package Wait_Time;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class implicitlyWait_demo {
    private WebDriver driver;
    private String url;

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        url = "http://automationpractice.com/index.php";
        driver.manage().window().maximize();

        //implicitlyWait()
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    void test(){
        driver.get(url);
        WebElement ele = driver.findElement(By.xpath("//input[@id=\"search_query_top\"]"));
        ele.sendKeys("xxxx");
    }

    @AfterEach
    void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
