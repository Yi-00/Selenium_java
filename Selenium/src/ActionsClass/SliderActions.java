//Udemy: 84   : các nút kéo thả

package ActionsClass;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class SliderActions {
    WebDriver driver;
    String url;

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        url = "https://jqueryui.com/slider/";

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    void testSlider() throws InterruptedException {
        //Load url
        driver.get(url);


        //Vì element muốn thao tác nằm trong frame nên cần switch to frame
        driver.switchTo().frame(0);
        Thread.sleep(3000);

        //find "Slider" element
        WebElement ele = driver.findElement(By.xpath("//div[@id=\"slider\"]/span"));

        //Actions class
        Actions action = new Actions(driver);
        //dragAndDropBy(ele_name, tọa độ x, tọa độ y).perfrom()
        action.dragAndDropBy(ele, 100, 0).perform();
    }

    @AfterEach
     void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
