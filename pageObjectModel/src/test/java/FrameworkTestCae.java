import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import pageClass.FindBy_demo;

import java.util.concurrent.TimeUnit;

public class FrameworkTestCae {
    private WebDriver driver;
    private String baseUrl;
    FindBy_demo find;

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        baseUrl="https://opensource-demo.orangehrmlive.com/";

        find = new FindBy_demo(driver);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    void test_valid_pw_user(){
        //Load url
        driver.get(baseUrl);

        find.inputPassword();
        find.inputPassword();
        find.clickLoginBtn();
    }

    @Test
    void test_invalid_username(){
        find.setUsername("");
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }
}
