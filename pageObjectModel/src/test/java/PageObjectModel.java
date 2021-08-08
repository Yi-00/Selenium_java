//Tách riêng các mục findElement, test,....  Udemy: 90

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageClass.LoginPage;

import java.util.concurrent.TimeUnit;

public class PageObjectModel {
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
        LoginPage.inputValue(driver, "//input[@id='txtUsername']", "Admin");
        //find and input Password
        LoginPage.inputValue(driver, "//input[@id='txtPassword']", "admin123");
        //click login button
        LoginPage.clickLogin(driver, "//input[@id='btnLogin']");
    }

    @AfterEach
    void tearDown() {
    }
}
