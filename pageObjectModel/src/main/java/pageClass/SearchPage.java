////Tách riêng các mục findElement, test,....  Udemy: 90

package pageClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
    public static WebElement element = null;

    //find "Liveing from" input
    public static WebElement livingTextBox(WebDriver driver){
        element = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        return element;
    }


}
