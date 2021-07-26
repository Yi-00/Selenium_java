//Udemy - 52 : phân tích
//Udemy - 53 : tiến hành

//Vô trang "https://courses.letskodeit.com/practice"  đẻ hình dung Multiple select

package JUnit;

import org.checkerframework.checker.units.qual.C;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import javax.swing.plaf.TableHeaderUI;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class Multiple_Select {
    WebDriver driver;
    String url;

    @BeforeEach
    void setUp() {
        //Create driver
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    void multipleSelect() throws InterruptedException {
        //Load url
        driver.get("https://courses.letskodeit.com/practice");


        //Step 1: tìm đến tag_name select chứa multiple select
        WebElement ele = driver.findElement(By.id("multiple-select-example"));


        //Step 2: Thông qua Select() để tiến hành chọn
        Select ele_select = new Select(ele);


        //Step 3: cách 1 : Select by value/index/visible  - De-select
        Thread.sleep(3000);
        System.out.println("Select Apple by value");
        ele_select.selectByValue("apple");          //Select by index

        Thread.sleep(3000);
        System.out.println("De-select Apple by value");   //De-select by index
        ele_select.deselectByValue("apple");

        Thread.sleep(3000);
        System.out.println("Select Orange by index");        //Select by index
        ele_select.selectByIndex(1);

        Thread.sleep(3000);
        System.out.println("De-select Orange by index");      //De-select by index
        ele_select.deselectByIndex(1);

        Thread.sleep(3000);
        System.out.println("Select Peach by visible text");   //Select by visible
        ele_select.selectByVisibleText("Peach");

        Thread.sleep(3000);
        System.out.println("De-select Peach by visible text");  //De-select by visible
        ele_select.selectByVisibleText("Peach");

        Thread.sleep(3000);
        System.out.println("Print all select option");         //Hiển thị tất cả các option được lựa chọn
        List<WebElement> selectOption = ele_select.getAllSelectedOptions();   //in tất cả các option đã chọn
        for(WebElement option: selectOption){
            System.out.println(option.getText());
        }

        Thread.sleep(3000);
        System.out.println("De-select all selected options");
        ele_select.deselectAll();                  //Bỏ chọn tất cả

    }

    @AfterEach
    void tearDown() {
    }
}