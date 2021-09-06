package stepdefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginScenarioOutlineDef{
    WebDriver driver;

    @Given("User is on Login Page {string}")
    public void user_is_on_login_page(String url) {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }

    @When("user input {string} And {string}")
    public void user_input_and(String username, String password) {
        WebElement userEle = driver.findElement(By.xpath("//input[@id='email']"));
        userEle.clear();
        userEle.sendKeys(username);

        WebElement pwdEle = driver.findElement(By.xpath("//input[@id='password']"));
        pwdEle.clear();
        pwdEle.sendKeys(password);
    }

    @And("user click on Login button")
    public void userClickOnLoginButton() {
        WebElement loginEle = driver.findElement(By.xpath("//button[@type='submit']"));
        loginEle.click();
    }
}
