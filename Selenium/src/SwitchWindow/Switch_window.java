//Udemy: 77    : getWindowhandle
//Udemy: 78    : .switchto()   đổi WindowHandle

package SwitchWindow;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Switch_window {
    WebDriver driver;
    String url;

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();             //Create driver
        url ="https://courses.letskodeit.com/practice";

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    void switchWindow() throws InterruptedException {
        driver.get(url);         //Load url

        //find button open window
        WebElement btn_ele = driver.findElement(By.xpath("//button[@id=\"openwindow\"]"));
        btn_ele.click();

        //.getWindowHandle()   : Lấy ID cửa sổ đang thao tác
        String perentHandle = driver.getWindowHandle();
        System.out.println(perentHandle);

        //mở 1 cửa sổ mới
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@id=\"openwindow\"]")).click();

        // .getWindowHandles  có "s" : lấy ID của tất cả các cửa sổ
        Set<String> handles = driver.getWindowHandles();
        for(String handle : handles){
            System.out.println(handle);
            //Switch window :  Đổi cửa sổ ,  trong trường hợp đa .getWindowHandle()
            //Nếu ID cửa sổ hiện tại không bằng perenHandle thì sẽ bằng handle còn lại
            if(!handle.equals(perentHandle)){
                driver.switchTo().window(handle);
                Thread.sleep(3000);
                //find link "ALL COURSES"
                WebElement link_ele = driver.findElement(By.xpath("//*[@id=\"navbar-inverse-collapse\"]/ul/li[2]/a"));
                link_ele.click();
            }
        }


    }

    @AfterEach
    void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
