import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class test {
    WebDriver driver;
    String url;
    JavascriptExecutor js;


    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        url = "https://courses.letskodeit.com/practice";

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    void testweb(){
        //Load url
        driver.get(url);

        //radio button




    }


    @AfterEach
    void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}