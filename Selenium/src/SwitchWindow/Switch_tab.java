//Udemy: 78: 5p
//Thay đổi giữa các tab

package SwitchWindow;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Switch_tab {
    WebDriver driver;
    String url;

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        url = "https://courses.letskodeit.com/practice";

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    void switchTab() throws InterruptedException {
        driver.get(url);

        //find present window handle
        String presentHandle = driver.getWindowHandle();

        Thread.sleep(3000);
        //find "Open tab" button
        WebElement openTab = driver.findElement(By.id("opentab"));
        //click để mở tab mới
        openTab.click();

        //Switch về window handle ban đầu
        driver.switchTo().window(presentHandle);

    }

    @AfterEach
    void tearDown() {
    }
}
