//Udemy - 52 : phân tích
//Udemy - 52 : tiến hành

//Vô trang "https://courses.letskodeit.com/practice"  đẻ hình dung Multiple select

package JUnit;

import org.checkerframework.checker.units.qual.C;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class Multiple_Select {
    WebDriver driver;
    String url;

    @BeforeEach
    void setUp() {
        //Create driver
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    void multipleSelect() throws InterruptedException {
        //Load url
        driver.get("https://courses.letskodeit.com/practice");

        Thread.sleep(3000);
        System.out.println("Select by value");

        Thread.sleep(3000);
        System.out.println("De-select by value");

        Thread.sleep(3000);
        System.out.println("Select by index");

        Thread.sleep(3000);
        System.out.println("De-select by index");

        Thread.sleep(3000);
        System.out.println("Select by visible text");

        Thread.sleep(3000);
        System.out.println("De-select by visible text");

        Thread.sleep(3000);
    }

    @AfterEach
    void tearDown() {
    }
}