//Tách riêng các mục findElement, test,....  Udemy: 90
//Giao diện Login page

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageClass.Execute;

import java.util.concurrent.TimeUnit;

public class LoginPage {
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

        //find and input Username
        Execute.inputValue(driver, "//input[@id='txtUsername']", "Admin");
        //find and input Password
        Execute.inputValue(driver, "//input[@id='txtPassword']", "admin123");
        //click login button
        Execute.clickLogin(driver, "//input[@id='btnLogin']");
    }

    @AfterEach
    void tearDown() {
    }
}
