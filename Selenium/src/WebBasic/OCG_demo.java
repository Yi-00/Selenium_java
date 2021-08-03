package WebBasic;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class OCG_demo {
    WebDriver driver;

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    void test(){
        driver.get("http://automationpractice.com/index.php");
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);

        Assertions.assertEquals("My Store", pageTitle, "Not equal");

        //click Sign in
        clickElement("//div[@class=\"header_user_info\"]/a");

        //enter email
        inputToElement("//input[@id=\"email\"]", "duc864@qq.com");

        //enter password
        inputToElement("//input[@id=\"passwd\"]", "test1234");

        //click Sign in button
        clickElement("//button[@id=\"SubmitLogin\"]");

        //Kiểm tra email, password có lỗi hay không
        String msg = getElementText("//*[@id=\"center_column\"]/div[1]/p");
        Assertions.assertEquals("There is 1 error", msg, "This Test Passed");
    }

    public WebElement getElement(String xpath){
        return driver.findElement(By.xpath(xpath));
    }

    public void waitElementVisible(String xpath){
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(xpath)));
    }

    public void clickElement(String xpath){
        waitElementVisible(xpath);
        getElement(xpath).click();
    }

    public String getElementText(String xpath){
        waitElementVisible(xpath);
        return getElement(xpath).getText();
    }

    public void inputToElement(String xpath, String value){
        waitElementVisible(xpath);
        WebElement e = getElement(xpath);
        e.clear();
        e.sendKeys(value);
    }

    @AfterEach
    void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
