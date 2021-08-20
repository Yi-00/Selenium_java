import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class LoginCucumberDemo extends Actions{
    WebDriver driver;
    String url;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        url = "https://jqueryui.com/datepicker/";
    }

    @Test
    public void loginTest(){
        driver.get(url);



    }

    @AfterMethod
    public void tearDown() {
    }
}