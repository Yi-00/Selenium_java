package WebBasic;

import org.junit.jupiter.api.AfterEach;
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
        String pageTitle = driver.getTitle();
        
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
    void tearDown() {
        driver.quit();
    }
}
