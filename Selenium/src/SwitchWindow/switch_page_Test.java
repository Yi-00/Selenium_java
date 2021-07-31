//Switch page:  udemy - 46
//Switch page, back(), forward(), refresh(), to(url)

package SwitchWindow;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class switch_page_Test {

    WebDriver driver;
    String url = "http://automationpractice.com/index.php";

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    void switchPage() throws InterruptedException {
        driver.get(url);
        String title = driver.getTitle();
        System.out.println("Website Title : " + title);
        System.out.println(driver.getCurrentUrl());

        //Switch page : udemy 46: 7p
        //login url
        String login_url = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
        driver.navigate().to(login_url);

        //Quay về trang trước : back()
        Thread.sleep(5000);
        driver.navigate().back();

        //Quay về trang vừa rồi  :  forward()
        Thread.sleep(5000);
        driver.navigate().forward();

        //refresh page  : refresh()
        Thread.sleep(2000);
        driver.navigate().refresh();

    }

    @AfterEach
    void tearDown() throws InterruptedException {
        System.out.println("----Complete----");
        Thread.sleep(5000);
        driver.close();
        driver.quit();
    }
}