//Udemy - 20
//chưa làm được - tìm hiểu lại

package WebBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilitiesDemo {
    public static void main(String[] args) {
        //đường dẫn đến chromedriver
        System.setProperty("webdriver.chrome.driver","D:\\Selenium_java\\Driver\\chromedriver.exe");

        //desired capabilities
        DesiredCapabilities caps = new DesiredCapabilities();


        //tạo driver với ChromeDriver
        WebDriver driver = new ChromeDriver();

        String url = "https://opensource-demo.orangehrmlive.com/";
        //load url
        driver.get(url);

        WebElement element = driver.findElement(By.id("txtUsername"));
        element.sendKeys("Admin");
    }}
