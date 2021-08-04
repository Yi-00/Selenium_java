//Udemy 54 - phân tích
//Udemy 55: implement

//element bị ẩn

package JUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.*;

class isDisplayed_Test {
        WebDriver driver;
        String url;

    @BeforeEach
    void setUp() {
        url = "https://courses.letskodeit.com/practice";
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    void Hide_element() throws InterruptedException {
        driver.get(url);
        //Find input
        WebElement textBox = driver.findElement((By.id("displayed-text")));
        //isDisplayed()  : Kiểm tra ô input đang hiển thị hay ẩn, nếu hiển thị trả về True
        System.out.println("Display: " + textBox.isDisplayed());

        //Find hide button
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id=\"hide-textbox\"]")).click();

        //Find show button
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id=\"show-textbox\"]")).click();
    }

    @AfterEach
    void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}