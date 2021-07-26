//Udemy - 59 : findElements   : tìm nhiều element

package Useful_Method;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

class GenericMethod_Demo2 {
    private WebDriver driver;
    private String url;
    private GenericMethod gm;


    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        url = "https://courses.letskodeit.com/practice";
        gm = new GenericMethod(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    void testMethod() throws InterruptedException {
        Thread.sleep(3000);
        driver.get(url);

        //Tìm các element có xpath = //input[@type="text"]
        List<WebElement> ele_list = (List<WebElement>) gm.getElementList("xpath","//input[@type=\"text\"]");
        int size = ele_list.size();

        //in ra số element tìm được
        System.out.println("List size: " + size);
    }

    @AfterEach
    void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
        Thread.sleep(3000);
        driver.quit();
    }
}