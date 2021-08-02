//Udemy: 83
//Kéo thả element từ vị trí A xang vị trí B

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

public class DragAndDrop {
    WebDriver driver;
    String url;

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        url = "https://jqueryui.com/droppable/";

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    void TestDragAndDrop() throws InterruptedException {
        driver.get(url);
        Thread.sleep(3000);

        //Vì 2 element muốn tìm đều trong frame nên cần switch to frame
        driver.switchTo().frame(0);

        //findElement 1
        WebElement fromElement = driver.findElement(By.id("draggable"));
        //findElement 2
        WebElement toElement = driver.findElement(By.id("droppable"));

        //add Actions class
        Actions action = new Actions(driver);
        //Cach 1: Kéo element từ vị trí fromElement đến vị trí toElement
        action.dragAndDrop(fromElement,toElement).perform();
        //Cach 2: Udemy: 83- 7p, clickAndHold().moveToElement().release().build().perform()
    }

    @AfterEach
    void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
