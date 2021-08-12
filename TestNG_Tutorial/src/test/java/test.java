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
        //enter user name
        inputValue("//input[@id='txtUsername']", "Admin");
        //enter password
        inputValue("//input[@id='txtPassword']", "admin123");
        //click login btn
        clickBtn("//input[@id='btnLogin']");
    }

    @AfterMethod
    public void tearDown() {
    }

    //find Element
    public WebElement getElement(String xpath){
        return getElement(xpath);
    }

    //input value
    public void inputValue(String xpath, String value){
        WebElement ele = getElement(xpath);
        ele.clear();
        ele.sendKeys(value);
    }

    //click login btn
    public void clickBtn(String xpath){
        getElement("//input[@id='btnLogin']").click();
    }
}