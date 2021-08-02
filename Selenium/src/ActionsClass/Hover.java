//Udemy 82 :   Actions  : mô phỏng các hành động của chuột : hover, click,....

package ActionsClass;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

public class Hover {
        WebDriver driver;
        String url;
        JavascriptExecutor js;

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        url = "https://courses.letskodeit.com/practice";

        //Convert type of driver from WebDriver to JavascriptsExecutor
        js = (JavascriptExecutor) driver;

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    void actions() throws InterruptedException {
        //Load url
        driver.get(url);

        //Scroll page
        js.executeScript("window.scrollBy(0,500);");
        Thread.sleep(3000);

        //findElement "Mouse Hover" button
        WebElement hover_ele = driver.findElement(By.xpath("//button[@id=\"mousehover\"]"));

        //Step 1: Actions
        Actions action = new Actions(driver);
        //Step 2: Di chyển chuột đến element mong muốn  + perform()
        action.moveToElement(hover_ele).perform();
    }

    @AfterEach
    void tearDown() {
    }
}
