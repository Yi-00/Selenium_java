import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class test{
    private WebDriver driver;
    private String url;

    @BeforeEach
    void setUp() {
        //Open ChromeDriver
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    void test(){
        url = "https://courses.letskodeit.com/practice";
        //Load URL
        driver.get(url);
        //findElement  +  waitTime
        WebDriverWait wait = new WebDriverWait(driver, 3);    //Step 1: Create Wait
        //Wait 3 minute from presence id "bmwradio"
        WebElement ele = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("bmwradio")));
        ele.click();
    }

    @AfterEach
    void tearDown() {
    }
}