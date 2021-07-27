//Udemy: 64

package Wait_Time;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class explicitWait {
    private WebDriver driver;
    private String url;

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        url = "http://automationpractice.com/index.php";
        driver.manage().window().maximize();
    }

    @Test
    void test(){
        driver.get(url);

        //Step 1: Dùng WebDriverWait
        WebDriverWait wait = new WebDriverWait(driver, 3);
        //Step 2:
        WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("search_query_top")));
        ele.sendKeys("xxxx");
    }

    @AfterEach
    void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
