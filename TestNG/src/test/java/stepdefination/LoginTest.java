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
    String url = "https://opensource-demo.orangehrmlive.com/";

    @Given("^User is on Login Page$")
    public void user_is_on_login_page() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);

    }
    @When("^User enter valid username$")
    public void user_enter_valid_username() {
        WebElement element = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        element.clear();
        element.sendKeys("Admin");
    }
    @When("^User enter valid password$")
    public void user_enter_valid_password() {
        WebElement element = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        element.clear();
        element.sendKeys("admin123");
    }
    @When("^User click on Login button$")
    public void user_click_on_login_button() {
        WebElement element = driver.findElement(By.xpath("//input[@id='btnLogin']"));
        element.click();
    }
    @Then("$User can visit home page$")
    public void user_can_visit_home_page() {
        WebElement element = driver.findElement(By.xpath("//a[@id='menu_dashboard_index']"));
        element.isDisplayed();
    }
}
