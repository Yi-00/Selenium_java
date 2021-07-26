//Udemy- 57 : getAttribute(arg)  : lấy giá trị của thuộc tính

package JUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.*;

class getAttribute {
    WebDriver driver;
    String url;

    @BeforeEach
    void setUp() {
        //Open driver
        driver = new ChromeDriver();
    }

    @Test
    void getAttribute() throws InterruptedException {
        //Load url
        url = "https://courses.letskodeit.com/practice";
        Thread.sleep(2000);
        driver.get(url);

        //Find element muốn lấy attribute
        WebElement ele = driver.findElement(By.id("carselect"));

        //getAttribute()   : lấy giá trị của thuộc tính "id"
        System.out.println(ele.getAttribute("id"));
    }

    @AfterEach
    void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}