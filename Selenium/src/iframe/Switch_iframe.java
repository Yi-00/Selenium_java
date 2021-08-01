//Udemy: 79
//Chuyển iframe

package iframe;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Switch_iframe {
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
    void iframe(){
        driver.get(url);

        //findElement Date picker input
        WebElement datePicker = driver.findElement(By.id("datepicker"));
        datePicker.click();
    }

    @AfterEach
    void tearDown() {
    }
}
