package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyActions {
    public static WebElement element;

    public static void waitElement(WebDriver driver, String xpath){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(xpath)));
    }

    public static WebElement getElement(WebDriver driver, String xpath){
        waitElement(driver, xpath);
        element = driver.findElement(By.xpath(xpath));
        return element;
    }

    public static void inputValue(WebDriver driver, String xpath, String value){
        waitElement(driver, xpath);
        element = getElement(driver, xpath);
        element.clear();
        element.sendKeys(value);
    }

    public static void clickOnBtn(WebDriver driver, String xpath){
        waitElement(driver, xpath);
        element = getElement(driver, xpath);
        element.click();
    }

    public static void switchToIframe(WebDriver driver, String xpath){
        waitElement(driver, xpath);
        element= getElement(driver, xpath);
        driver.switchTo().frame(element);
    }
}
