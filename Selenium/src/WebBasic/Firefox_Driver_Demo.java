//Udemy - 19

package WebBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox_Driver_Demo {
    public static void main(String[] args) {
        //path to geckodriver
        System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\Desktop\\QA\\Selenium_java\\Driver\\chromedriver.exe");
        //create driver
        WebDriver driver = new FirefoxDriver();

        String url = "https://mobile.x-cart.com/";

        // load url
        driver.get(url);
    }
}
