//Udemy - 67  - chưa hiểu rõ, xem lại

package Wait_Time;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


//Define class call "WaitTime"
public class WaitTime_02 {
    private WebDriver driver;

    public WaitTime_02() {
    }

    public WaitTime_02(WebDriver driver) {
        this.driver = driver;
    }

    //Phương án 2: với điều kiện : elementToBeClickable
    public WebElement clickWhenAlready(By locator, int timeout){
        WebElement element = null;
        try{
            System.out.println("Can click "+ timeout + " second");
            //Step 1: Dùng WebDriverWait
            WebDriverWait wait = new WebDriverWait(driver, 3);
            //Step 2:
            element = wait.until(ExpectedConditions.elementToBeClickable(locator));
            element.click();

            System.out.println("Already click element");
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
