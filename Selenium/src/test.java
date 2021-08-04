import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class test {
    WebDriver driver;
    String url;

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        url = "https://opensource-demo.orangehrmlive.com/";

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    void testWeb(){
        //Load url
        driver.get(url);

        //input email
        inputValue("//input[@id='txtUsername']", "Admin");

        //input password
        inputValue("//input[@id='txtPassword']", "admin123");

        //click login btn
        clickBtn("//input[@id='btnLogin']");
    }

    //Wait time
    public void waitTime(String xpath){
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(xpath)));
    }

    //getElement
    public WebElement getElement(String xpath){
        return driver.findElement(By.xpath(xpath));
    }

    //senKeys
    public void inputValue(String xpath, String value){
        waitTime(xpath);
        WebElement e = getElement(xpath);
        e.clear();
        e.sendKeys(value);
    }

    //click
    public void clickBtn(String xpath){
        waitTime(xpath);
        getElement(xpath).click();
    }

    @AfterEach
    void tearDown() {
    }
}