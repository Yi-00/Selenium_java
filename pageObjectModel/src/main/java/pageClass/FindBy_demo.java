package pageClass;//Tách riêng các mục findElement, test,....  Udemy: 91
//Giao diện Home page

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FindBy_demo {
    //dùng @FindBy : tìm username theo xpath
    @FindBy(xpath="//a[@id='txtUsername']")
    WebElement username;

    //dùng @FindBy : tìm password theo xpath
    @FindBy(xpath="//a[@id='txtPassword']")
    WebElement password;

    //dùng @FindBy : tìm login button theo xpath
    @FindBy(xpath="//a[@id='btnLogin']")
    WebElement loginBtn;

    //enter username
    public void inputUsername(){
        username.sendKeys("Admin");
    }

    //enter password
    public void inputPassword(){
        password.sendKeys("admin123");
    }

    //click login button
    public void clickLoginBtn(){
        loginBtn.click();
    }
}
