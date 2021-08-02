//Alert : cách xử lý
//Udemy - 81

package JUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;

import java.util.concurrent.TimeUnit;

public class Alert_solution {
    WebDriver driver;
    String url;

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        url = "https://courses.letskodeit.com/practice";
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    //.accept()
    @Test
    void alertAccept() throws InterruptedException {
        driver.get(url);   //Load url

        //find input "Enter name"
        driver.findElement(By.xpath("//input[@name=\"enter-name\"]")).sendKeys("QUAN");

        //find "Alert" button
        driver.findElement(By.xpath("//input[@id=\"alertbtn\"]")).click();

        Thread.sleep(3000);

        //switchTo().Alert()   : switch to alert
        //Step 1: use Alert()
        Alert alert = driver.switchTo().alert();
        //Step 2:    .accept()    để xác nhận
        alert.accept();


    }

    //.dismiss()
    @Test
    void alertDismiss() throws InterruptedException {
        driver.get(url);   //Load url

        //find input "Enter name"
        driver.findElement(By.xpath("//input[@name=\"enter-name\"]")).sendKeys("QUAN");

        //find "Confirm" button
        driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();

        Thread.sleep(3000);

        //switchTo().Alert()   : switch to alert
        //Step 1: use Alert()
        Alert alert = driver.switchTo().alert();
        //Step 2:    .dismiss()    từ chối
        alert.dismiss();
    }

    @AfterEach
    void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
