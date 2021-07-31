//Udemy : 77 : Lấy ID cửa sổ muốn thao tác

package SwitchWindow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class getWindowHandle {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();     //Create driver
        driver.get("https://courses.letskodeit.com/practice");    //Load URL

        //.getWindowHandle()   : Lấy ID cửa sổ đang thao tác
        String perentHandle = driver.getWindowHandle();
        System.out.println(perentHandle);

        //mở 1 cửa sổ mới
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@id=\"openwindow\"]")).click();

        // .getWindowHandles  có "s" : lấy ID của tất cả các cửa sổ
        Set<String> handles = driver.getWindowHandles();
        for(String i : handles){
            System.out.println(i);
        }

        Thread.sleep(3000);
        driver.quit();
    }
}
