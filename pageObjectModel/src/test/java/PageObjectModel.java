//Tách riêng các mục findElement, test,....  Udemy: 90

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class PageObjectModel {
    private WebDriver driver;
    private String baseUrl;

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        baseUrl="https://www.expedia.com/";

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    void test(){
        driver.get(baseUrl);
    }


    @AfterEach
    void tearDown() {
    }
}
