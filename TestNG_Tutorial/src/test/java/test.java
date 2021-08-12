import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class test {
    WebDriver driver;
    String url;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        url = "https://opensource-demo.orangehrmlive.com/";
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void loginTest(){
        LoginPage.inputValue(driver, "//input[@id='txtUsername']", "Admin");
        LoginPage.inputValue(driver, "//input[@id='txtPassword']", "admin123");
        LoginPage.clickElement(driver, "//input[@id='btnLogin']");
    }

    @AfterMethod
    public void tearDown() {
    }
}