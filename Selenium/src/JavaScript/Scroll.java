//Cuận trang web : Udemy: 75   : khó xem lại

package JavaScript;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Scroll {

    WebDriver driver;
    String url;

    //Step 1: add JavascriptExecutor
    JavascriptExecutor js;

    @BeforeEach
    void setUp() {
        //Create driver
        driver = new ChromeDriver();
        url = "https://courses.letskodeit.com/practice";


        //Step 2: Convert kiểu dữ liệu của driver từ WebDriver -> JavascriptExecutor
        js = (JavascriptExecutor) driver;

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    void scroll() throws InterruptedException {
        //Load url
        driver.get(url);

        Thread.sleep(3000);

        //cuận xuống dưới:    scrollBy(0, 500)   cuận từ height: 0  đến 500
        js.executeScript("window.scrollBy(0, 900);");
        Thread.sleep(2000);

        //cuận lên trên:     scrollBy(0, -500)   cuận ngược thì viết giá trị âm :-500
        js.executeScript("window.scrollBy(0, -900);");
        Thread.sleep(2000);

        //Tìm đến ô Search input
        WebElement ele = driver.findElement(By.xpath("//input[@id=\"search\"]"));

        //cuận đến ele mong muốn    : chưa làm được
//        js.executeScript("arguments[0].scrollIntoView(true);", ele);

        ele.sendKeys("Python");

        //Click icon search
        driver.findElement(By.xpath("//*[@id=\"search\"]/div/button")).click();
    }


    @AfterEach
    void tearDown() {
    }
}
