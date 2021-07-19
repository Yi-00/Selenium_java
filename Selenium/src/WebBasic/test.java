package WebBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
    public static void main(String[] args) {
        //create driver
        WebDriver driver = new ChromeDriver();
        //values
        String url = "https://courses.letskodeit.com/practice";
        //load url
        driver.get(url);
        //find element
        driver.findElement(By.id("alertbtn")).click();
    }
}