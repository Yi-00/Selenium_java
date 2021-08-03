import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
    private WebDriver driver;
    private JavascriptExecutor js;

    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;

        // Maximize the browser's window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void testJavaScriptExecution() throws Exception {
        // ´ò¿ªÓ¦ÓÃ
        js.executeScript("window.location = 'https://www.migang.com'");
        Thread.sleep(3000);

        // ÏòÏÂ¹ö¶¯
        js.executeScript("window.scrollBy(0,1900);");
        Thread.sleep(2000);

        // ÏòÉÏ¹ö¶¯
        js.executeScript("window.scrollBy(0,-1900);");
        Thread.sleep(2000);

        // ¹ö¶¯µ½Òª²Ù×÷µÄÔªËØµÄÎ»ÖÃ
        WebElement element = driver.findElement(By.xpath("//h2/a[contains(text(),'Ã×¸×¶¨ÆÚ')]"));
        js.executeScript("arguments[0].scrollIntoView(true);",element);
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,-190);");

//		element.click();
    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(3000);
        driver.quit();
    }
}
