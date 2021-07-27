//Udemy: 65   : kết hợp với WaitTime

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

public class explicitWait_with_WaitTime {
    private WebDriver driver;
    private String url;
    private WaitTime wt;       //Call

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        url = "http://automationpractice.com/index.php";
        wt = new WaitTime(driver);
        driver.manage().window().maximize();
    }

    @Test
    void test(){
        driver.get(url);

        //Sau khi đóng gói
        WebElement ele = wt.waitForElement(By.id("search_query_top"), 3);
        ele.sendKeys("aaaa");

        //Cách bình thường
/*        //Step 1: Dùng WebDriverWait
        WebDriverWait wait = new WebDriverWait(driver, 3);
        //Step 2:
        WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("search_query_top")));
        ele.sendKeys("xxxx");*/


    }

    @AfterEach
    void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
