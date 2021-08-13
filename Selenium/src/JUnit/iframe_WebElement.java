package JUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * bước 1: dùng WebElement tìm đến Element iframe
 * bước 2: switch to frame
 * chú ý: không truyền trực tiếp xpath vô frame() -> sẽ không tìm được
 */
public class iframe_WebElement {
    WebDriver driver;
    String url;

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        url = "https://jqueryui.com/datepicker/";
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    void testFrame() throws InterruptedException {
        driver.get(url);
        Thread.sleep(3000);
        int size = driver.findElements(By.tagName("iframe")).size();
        System.out.println(size);
        WebElement ifElement = driver.findElement(By.xpath("//div[@class='demo-list']/following::iframe"));
        driver.switchTo().frame(ifElement);
        WebElement element = driver.findElement(By.xpath("//input[@id='datepicker']"));
        Thread.sleep(3000);
        element.click();
        element.sendKeys("1");
        Thread.sleep(3000);
    }

    @AfterEach
    void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
