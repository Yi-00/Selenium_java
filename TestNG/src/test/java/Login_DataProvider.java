//Udemy: 244

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Login_DataProvider extends MyActions {
   WebDriver driver;
   String url = "https://opensource-demo.orangehrmlive.com/";

    @BeforeMethod
    public void setUp() {
     driver = new ChromeDriver();
    }

    @Test(dataProvider = "login", dataProviderClass = DataLogin.class)
    public void test(String uname, String pwd){
     driver.get(url);

     inputValue(driver, "//input[@id='txtUsername']", uname);
     inputValue(driver, "//input[@id='txtPassword']", pwd);
     clickOnBtn(driver, "//input[@id='btnLogin']");

    }

    @AfterMethod
    public void tearDown() {
    }
}
