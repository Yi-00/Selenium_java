//Radio, Checkbox : solution
//Udemy - 49 - xem lại
//Ví dụ này làm về Radio, Checkbox làm tương tự ( nhưng checkbox có thể hủy sau khi chọn )

package JUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class Radio_button {

    WebDriver driver;
    String url;

    @BeforeEach
    void setUp() {
        //create driver
        driver = new ChromeDriver();
        url = "https://courses.letskodeit.com/practice";
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    void Radio_button() throws InterruptedException {
        driver.get(url);

        //cách 1 : xpath: //input[@type="radio"]       :tìm tất cả Radio theo type
        //cách tìm xpath bên trên không nên dùng, vì nếu page có nhiều Radio, thì sẽ lấy tất cả
        //cách 2 : xpath: //input[contains(@type,"radio") and contains(@name,"cars")]

        //isCheck = false: là chưa được select
        boolean isCheck = false;

        //Create a list, findElements thêm "s"
        List<WebElement> radioButtons = driver.findElements(By.xpath("//input[contains(@type,\"radio\")and contains(@name,\"cars\")]"));
        //size() : size của list???
        int size = radioButtons.size();

        System.out.println("Colection: "+ size);

        //nếu chưa select thì click, còn select rồi thì bỏ qua
        for(int i = 0; i < size; i++){
             isCheck = radioButtons.get(i).isSelected();
             //nếu chưa được select thì click
             if(!isCheck){
                 radioButtons.get(i).click();
                 Thread.sleep(2000);
             }
        }
    }


    @AfterEach
    void tearDown() {
    }
}