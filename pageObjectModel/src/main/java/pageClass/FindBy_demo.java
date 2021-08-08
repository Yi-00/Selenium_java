//Xem lại chưa học hết
//Tách riêng các mục findElement, test,....  Udemy: 91-92
//Giao diện Home page

package pageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FindBy_demo {
    WebDriver driver;

    //dùng @FindBy : tìm username theo xpath
    @FindBy(xpath="//a[@id='txtUsername']")
    WebElement username;

    //dùng @FindBy : tìm password theo xpath
    @FindBy(xpath="//a[@id='txtPassword']")
    WebElement password;

    //dùng @FindBy : tìm login button theo xpath
    @FindBy(xpath="//a[@id='btnLogin']")
    WebElement loginBtn;

    //Constructoe have param
    public FindBy_demo(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getUsername() {
        return username;
    }

    public void setUsername(WebElement username) {
        this.username = username;
    }

    public WebElement getPassword() {
        return password;
    }

    public void setPassword(WebElement password) {
        this.password = password;
    }

    public WebElement getLoginBtn() {
        return loginBtn;
    }

    public void setLoginBtn(WebElement loginBtn) {
        this.loginBtn = loginBtn;
    }

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
