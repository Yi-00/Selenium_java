//Udemy:76  - xem lai
//Tạo ảnh chụp màn hình

package JUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

//import org.apache.commons.io.FileUtils;              //không import đc FileUtils

public class ScreenShot {
    WebDriver driver;
    String url;

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        url = "https://opensource-demo.orangehrmlive.com/";

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    void screenShot(){
        //Load URL
        driver.get(url);

        //findElement: Username      +  sendKeys()
        driver.findElement(By.id("txtUsername")).sendKeys("admin");

        //findElement: Login button  +  click()
        driver.findElement(By.id("btnLogin"));
    }

    //Tạo name random sau khi screenshot, nếu không sẽ bị trùng tên
    public static String getRandomString(int length){       //length : là độ dài tên file, ta sẽ truyền vào
        StringBuilder sb = new StringBuilder();
        String characters = "abcdefghijklnmopqrstuvxwyzABCDEFGHIJKLNMOPQRWYXZ1234567890";
        for(int i = 0; i < length; i++){
            int index = (int) (Math.random() * characters.length());
            sb.append(characters.charAt(index));
        }
        return sb.toString();
    }

    @AfterEach
    void tearDown() throws InterruptedException {
        Thread.sleep(4000);

        //Sau khi test xong mới cắt ảnh màn hình, nên để trong mục tearDown()
        String filename = getRandomString(10)+".png";          //Tên file có độ dài là 10, có đuôi .png
        String directory = "C:\\Users\\Admin\\Pictures\\Selenium ScreenShot";        //Đường dẫn sẽ lưu file

        File sourceFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);     //File : trong java có sẵn
//        FileUtils.copyFile     // chưa làm được vì không import được FileUtils


        driver.quit();
    }
}
