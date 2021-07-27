//Udemy: 65   : kết hợp với WaitTime

package Wait_Time;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class explicitWait_with_WaitTime_02 {
    private WebDriver driver;
    private String url;
    private WaitTime_02 wt;       //Call

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        url = "https://courses.letskodeit.com/practice";
        wt = new WaitTime_02(driver);
        driver.manage().window().maximize();
    }

    @Test
    void test(){
        driver.get(url);

        //Sau khi đóng gói
        wt.clickWhenAlready(By.id("alertbtn"), 3);

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
