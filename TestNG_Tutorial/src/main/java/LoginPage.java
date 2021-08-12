import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    public static WebElement element;

    public static WebElement getElement(WebDriver driver, String xpath){
        element = driver.findElement(By.xpath(xpath));
        return element;
    }

    public static void inputValue(WebDriver driver, String xpath, String value){
        element = getElement(driver, xpath);
        element.clear();
        element.sendKeys(value);
    }

    public static void clickElement(WebDriver driver, String xpath){
        element = getElement(driver, xpath);
        element.click();
    }
}
