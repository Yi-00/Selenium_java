package WebBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_Driver_Demo {
    public static void main(String[] args) {
        String url = "https://opensource-demo.orangehrmlive.com/";
        //path to driver
//        System.setProperty("webdriver.chrome.driver", "D:\\Selenium_java\\Driver\\chromedriver.exe");
        //Create driver
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        //Mở to cửa sổ
        driver.manage().window().maximize();
        //find element user name by ID
        WebElement ele = driver.findElement(By.id("txtUsername"));
        ele.sendKeys("Admin");

        //find element password by xpath
        WebElement ele_pw = driver.findElement(By.xpath("//*[@id=\"txtPassword\"]"));
        ele_pw.sendKeys("admin123");

    }
}
