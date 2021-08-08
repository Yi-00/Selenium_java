package pageClass;////Tách riêng các mục findElement, test,....  Udemy: 90

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Execute {
    public static WebElement element = null;

    //find [username] element
    public static WebElement getElement(WebDriver driver, String xpath){
        element = driver.findElement(By.xpath(xpath));
        return element;
    }

    //senKeys()
    public static void inputValue(WebDriver driver, String xpath, String value){
        element = getElement(driver, xpath);
        element.clear();
        element.sendKeys(value);
    }

    //click [Login] button
    public static void clickLogin(WebDriver driver, String xpath){
        element = getElement(driver, xpath);
        element.click();

    }

}
