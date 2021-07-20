//xác nhận trạng thái của element ( disable : vô hiệu hóa, enabled: kích hoạt)
//Udemy - 47

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

class isEnable_Test {
    WebDriver driver;
    String url;

    @BeforeEach
    void setUp() {
        //create
        driver = new ChromeDriver();
        url = "https://opensource-demo.orangehrmlive.com/";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(url);
    }

    @Test
    void testWeb(){
        WebElement ele_1 = driver.findElement(By.id("txtUsername"));
        //Kiểm tra trạng thái của element ele_1 thông qua .isEnabled()
        System.out.println("ele_1 is enable? " + ele_1.isEnabled());
        ele_1.sendKeys("AAA");
    }


    @AfterEach
    void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}