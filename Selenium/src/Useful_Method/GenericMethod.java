//Udemy - 58 :  Đóng gói riêng từng các method

package Useful_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Locale;

public class GenericMethod {
    WebDriver driver;

    //Định nghĩa đối tượng tên "GenericMethd" mở driver  ???
    public GenericMethod(WebDriver driver){
        this.driver = driver;              //Gán driver
    }

    //Định nghĩa method "getElement" để tìm các element  : thay thế cho : driver.findElement()
    //locator chứa url, element,.... , type là findElement theo id,xpath,link text,...
    public WebElement getElement(String type, String locator){

        type = type.toLowerCase();            //Chuyển thành chữ thường

        if(type.equals("id")){
            return this.driver.findElement(By.id(locator));         //findElement by ID
        }else if(type.equals("xpath")){
            return this.driver.findElement(By.xpath(locator));      //findElement By Xpath
        }else {
            System.out.println("The location path is not supported");     //Nếu nhập type sai
            return null;
        }
        //Các cách tìm findElement khác(class, linkText,...) tự làm thêm
    }

    //Udemy - 59 : findElements ( thêm "s" ) -tìm nhiều element
    //Định nghĩa đối tượng "getElementList" để tìm các element  : thay thế cho : driver.findElement()
    //locator chứa url, element,.... , type là findElement theo id,xpath,link text,...
    public List<WebElement> getElementList(String type, String locator){

        type = type.toLowerCase();            //Chuyển thành chữ thường

        if(type.equals("id")){
            return this.driver.findElements(By.id(locator));         //findElement by ID
        }else if(type.equals("xpath")){
            return this.driver.findElements(By.xpath(locator));      //findElement By Xpath
        }else {
            System.out.println("The location path is not supported");     //Nếu nhập type sai
            return null;
        }
        //Các cách tìm findElement khác(class, linkText,...) tự làm thêm
    }
}
