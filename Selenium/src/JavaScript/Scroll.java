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
        url = "http://demo.guru99.com/test/guru99home/";


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

        //Find element by link text and store in variable "Element"
        WebElement Element = driver.findElement(By.linkText("Linux"));

        //This will scroll the page till the element is found
        js.executeScript("arguments[0].scrollIntoView();", Element);
    }


    @AfterEach
    void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
