import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
    WebDriver driver;
    String url;

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        url = "https://courses.letskodeit.com/practice";

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    void switchWindow() throws InterruptedException {
        driver.get(url);    //Load url

        //find present window handle
        String presentHandle = driver.getWindowHandle();

        Thread.sleep(3000);
        WebElement btn_ele = driver.findElement(By.xpath("//button[@id=\"openwindow\"]"));
        btn_ele.click();

        //find all window handle

    }

    @AfterEach
    void tearDown() {
    }
}
