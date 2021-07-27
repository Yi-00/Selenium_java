//Udemy - 65  - chưa hiểu rõ, xem lại

package Wait_Time;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


//Define class call "WaitTime"
public class WaitTime {
    private WebDriver driver;

    public WaitTime() {
    }

    public WaitTime(WebDriver driver) {
        this.driver = driver;
    }

    //Phương án 1 : với điều kiện visibilityOfElementLocated
    public WebElement waitForElement(By locator, int timeout){
        WebElement element = null;
        try{
            System.out.println("Have been waiting for "+ timeout + " second");
            //Step 1: Dùng WebDriverWait
            WebDriverWait wait = new WebDriverWait(driver, 3);
            //Step 2:
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

            System.out.println("The element appears on the page");
        }catch(Exception e){//Nếu có ngoại lệ, catch sẽ bắt lấy ngoại lệ
            System.out.println("Have an error: " + e);
        }
        return element;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }
}
