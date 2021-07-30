//Lấy height, width của cửa sổ bằng driver
//nếu muốn lấy theo Javascript - xem Udemy: 74

package JUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getSize_driver {

    WebDriver driver;

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
    }

    @Test
    void getSize_driver(){
        //getHeight
        double size = driver.manage().window().getSize().getHeight();
        System.out.println(size);

        //getWidth
        System.out.println(driver.manage().window().getSize().getWidth());
    }

    @AfterEach
    void tearDown() {
    }
}
