import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import pageClass.FindBy_demo;

import java.util.concurrent.TimeUnit;

public class LoginPage_FindBy {
    private WebDriver driver;
    private String baseUrl;

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        baseUrl="https://opensource-demo.orangehrmlive.com/";

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    void test(){
        //Load url
        driver.get(baseUrl);


    }

    @AfterEach
    void tearDown() {
    }
}
