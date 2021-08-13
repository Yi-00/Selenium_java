import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class test {
    WebDriver driver;
    String url;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        url = "https://jqueryui.com/datepicker/";
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void test() throws InterruptedException {
        driver.get(url);
        Thread.sleep(3000);
        int size = driver.findElements(By.tagName("iframe")).size();
        System.out.println(size);
        WebElement ifElement = driver.findElement(By.xpath("//div[@class='demo-list']/following::iframe"));
        driver.switchTo().frame(ifElement);
        WebElement element = driver.findElement(By.xpath("//input[@id='datepicker']"));
        Thread.sleep(3000);
        element.click();
        element.sendKeys("1");
        Thread.sleep(3000);
    }


    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}