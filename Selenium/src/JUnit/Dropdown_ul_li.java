//Xử lý dropdown menu dạng <ul> <li> , <div>
//Udemy - 72     -  Hay - xem lại

package JUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Dropdown_ul_li {
    private WebDriver driver;
    private String url;

    @BeforeEach
    void setUp() throws InterruptedException {
        //Create driver
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }

    @Test
    void test() throws InterruptedException {
        url = "https://www.expedia.com/";
        driver.get(url);                //Load url

        //Tìm đến "Search" button
        WebElement ele = driver.findElement(By.xpath("//*[@id=\"location-field-destination-menu\"]/div[1]/button"));

        //Enter "Beijing"
        ele.sendKeys("Beijing");


        //Tìm đến thẻ chứa các list mong muốn
        WebElement ul_ele = driver.findElement(By.xpath("//*[@id=\"location-field-destination-menu\"]/div[2]/ul"));

        //Tạo list chứa tất cả các thẻ <li>
        //Tìm trong thẻ <li> trong thẻ <ul> vừa tìm bên trên, nên là ul_ele.findElement   ,chứ không phải driver.findElement
        //Tìm theo thẻ <li> , nên tìm theo tagname
        List<WebElement> li_list = ul_ele.findElements(By.tagName("li"));

        //in ra số thẻ <li> đã tìm được
        int size = li_list.size();
        System.out.println("Số thẻ <li> tìm được là " + size);

/*        //Lay toan bo text
        for(int i = 0; i < size; i++){
            System.out.println(li_list.get(i).getText());
        }
*/


        Thread.sleep(3000);

        //Nếu giá trị text của thẻ <li> là "Beijing China" thì click chọn
        for(WebElement li: li_list){
            if(li.getText().equals("Beijing\n" + "China")){
                System.out.println(li.getText());
                li.click();
                break;
            }
        }

    }

    @AfterEach
    void tearDown() {
        }
}
