import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
    WebDriver driver;
    String url;

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
    }

    @Test
    void test(){
        //getHeight
        double size = driver.manage().window().getSize().getHeight();
        System.out.println(size);


    }


    @AfterEach
    void tearDown() {
    }
}