//Udemy-50 : phân tích
//Udemy-51: Làm

package JUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Select_Dropdown_menu {
    WebDriver driver;
    String url;

    @BeforeEach
    void setUp() {
        //create driver
        driver = new ChromeDriver();
        url = "https://courses.letskodeit.com/practice";
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);

        //select id
    }

    @Test
    void testDropdown() throws InterruptedException {
        //Tìm id select
        WebElement ele_select = driver.findElement(By.id("carselect"));
        //Thông qua Select() tạo định nghĩa đối tượng sel
        Select sel = new Select(ele_select);

        //Select by visible text
        Thread.sleep(3000);
        System.out.println("Select Benz by visible text");
        sel.selectByVisibleText("Benz");

        //Select by index
        Thread.sleep(3000);
        System.out.println("Select BMW by index");
        sel.selectByIndex(0);

        //Select by value
        Thread.sleep(3000);
        System.out.println("Select Honda by value");
        sel.selectByValue("honda");

        //
    }

    @AfterEach
    void tearDown() {
    }
}
