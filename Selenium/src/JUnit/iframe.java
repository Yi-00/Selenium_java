//Udemy: 79 : cách nhận biết iframe
//demy: 80 : Cách thực hiện

package JUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class iframe {
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
    void iframe() throws InterruptedException {
        driver.get(url);

        //Step 1: switchTo iframe
        //ifram index bắt đầu từ 0; thường 1 page chỉ có 1 iframe, nếu 0 không được, thì sẽ sửa lại
        driver.switchTo().frame(0);

        Thread.sleep(3000);
        //find element Date picker button
        WebElement ele = driver.findElement(By.id("datepicker"));
        ele.click();

        Thread.sleep(3000);
        //defaultContent() : Switch về cửa sổ ban đầu
        driver.switchTo().defaultContent();

        Thread.sleep(3000);
        //find search input
        driver.findElement(By.xpath("//input[@name=\"s\"]")).sendKeys("This Test Complete");

    }

    @AfterEach
    void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
