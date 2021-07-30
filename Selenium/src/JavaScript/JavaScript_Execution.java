//Udemy : 73    -   Hay + xem lại
//Sử dụng JavaScripExecutor : load url, find element


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

import static org.junit.jupiter.api.Assertions.*;

class JavaScript_Execution {
    private WebDriver driver;
    String url;
    private JavascriptExecutor js;

    @BeforeEach
    void setUp() {
        url = "http://automationpractice.com/index.php";
        //Create driver
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

/*        Convert type của driver thành JavaScrip_Execution
        ( giống như convert kiểu dữ liệu float -> int: int a = (int) 10.0f;)     */
        js = (JavascriptExecutor)driver;
    }

    @Test
    void testJavaScrip() throws InterruptedException {
        //Load url : normal
        driver.get(url);

        //Load url from Javascript
        js.executeScript("window.location = 'http://automationpractice.com/index.php';");

        Thread.sleep(3000);

/*        //findElement: normal
        WebElement ele_search = driver.findElement(By.id("search_query_top"));
        ele_search.sendKeys("T-Shirt");*/

        //use Javascript find element
        WebElement ele_search = (WebElement) js.executeScript("return document.getElementById('search_query_top');");

        //sendKeys()
        ele_search.sendKeys("T-shirt");
    }

    @AfterEach
    void tearDown() throws InterruptedException {
        Thread.sleep(3000);
    }
}