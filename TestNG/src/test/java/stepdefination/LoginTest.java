package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginTest {
    WebDriver driver;

    @Given("User is on Login Page")
    public void user_is_on_login_page() {
        driver = new ChromeDriver();
        String url = "https://opensource-demo.orangehrmlive.com/";

        driver.manage().window().maximize();
        driver.get(url);
    }
    @When("User enter valid username")
    public void user_enter_valid_username() {
//        inputValue(driver, "//input[@id='txtUsername']", "Admin");
        WebElement element = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        element.clear();
        element.sendKeys("Admin");
    }
    @When("User enter valid password")
    public void user_enter_valid_password() {
//        inputValue(driver, "//input[@id='txtPassword']", "admin123");
        WebElement element = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        element.clear();
        element.sendKeys("admin123");
    }
    @When("User click on Login button")
    public void user_click_on_login_button() {
//        clickOnBtn(driver, "//input[@id='btnLogin']");
        WebElement element = driver.findElement(By.xpath("//input[@id='btnLogin']"));
        element.click();
    }
    @Then("User can visit home page")
    public void user_can_visit_home_page() {
        //Nếu login thành công mới tìm thấy element bên dưới
        WebElement element = driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']"));
//        getElement(driver, "//a[@id='menu_admin_viewAdminModule']");
    }

}
