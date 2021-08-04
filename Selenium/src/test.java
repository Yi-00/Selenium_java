import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
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
        url = "https://courses.letskodeit.com/practice";

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    void testWeb() throws InterruptedException {
        driver.get(url);

        clickElement("//input[@id='alertbtn']");


        Thread.sleep(3000);
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    //wait time
    public void waitTime(String xpath){
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(xpath)));
    }

    //find element
    public WebElement getElement(String xpath){
        waitTime(xpath);
        return driver.findElement(By.xpath(xpath));
    }

    //click
    public void clickElement(String xpath){
        waitTime(xpath);
        getElement(xpath).click();
    }

    @AfterEach
    void tearDown() {
    }
}