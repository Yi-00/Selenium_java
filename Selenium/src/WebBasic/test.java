package WebBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
    public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver", "D:\\Selenium_java\\Driver\\chromedriver.exe");
        //create driver
        WebDriver driver = new ChromeDriver();
        //values
        String url = "https://opensource-demo.orangehrmlive.com/";

        //load url
        driver.get(url);
        //find element
        driver.findElement(By.id("txtUsername")).sendKeys("AAAA");
    }
}