//import org.openqa.selenium.By;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.*;

public class test {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://mobile.x-cart.com/");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"header-area\"]/div[1]/div/div[4]/div/ul/li[3]/a")).click();
    }
}