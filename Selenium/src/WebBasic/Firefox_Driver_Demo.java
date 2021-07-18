//Udemy - 19

package WebBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox_Driver_Demo {
    public static void main(String[] args) {
        //path to geckodriver
        System.setProperty("webdriver.gecko.driver","D:\\Selenium_java\\Driver\\geckodriver.exe");
        //create driver
        WebDriver driver = new FirefoxDriver();

        String url = "D:\\Selenium_java\\Driver\\geckodriver.exe";

        // load url
        driver.get(url);
    }
}
