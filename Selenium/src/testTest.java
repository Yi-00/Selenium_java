import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.jupiter.api.Assertions.*;

class testTest {
    WebDriver driver;
    String url;

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    void test(){
        //load url
        driver.get("https://opensource-demo.orangehrmlive.com/");
        //wait time
        WebDriverWait wait = new WebDriverWait(driver, 3);
        //find element username
        WebElement ele_ac = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txtUsername")));
        ele_ac.sendKeys("Admin");

        //find element password
        WebElement ele_pw= wait.until(ExpectedConditions.presenceOfElementLocated(By.id("txtPassword")));
        ele_pw.sendKeys("admin123");

        //find element login button
        WebElement ele_btn = wait.until(ExpectedConditions.elementToBeClickable(By.id("btnLogin")));
        ele_btn.click();
    }

    @AfterEach
    void tearDown() {
    }
}