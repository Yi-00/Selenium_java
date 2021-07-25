import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
    public static void main(String[] args) {
        System.setProperty("webdrive.chrome.driver", "D:\\chromedriver_win32\\chromedrive.exe");
        WebDriver driver = new ChromeDriver();
        String url="https://au-webhook-adc1.onshopbase.com/checkouts/8002e445bfc8485b90091ec41865f8e5?step=shipping_method";
        driver.get(url);
        WebElement disCode = driver.findElement(By.className("s-input__inner"));
        disCode.sendKeys("testing");
        String dis = disCode.getAttribute("value");
        WebElement apply = driver.findElement(By.xpath("//button[contains(text(),'Apply')]"));
        apply.click();
        //Case a
        if(dis.equalsIgnoreCase("testing") ){
            WebElement code =driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/span[2]"));
            if(code.getText().equals("TESTING")){
                System.out.println("PASS");
            }

        }else{
            System.out.println("FALSE");
        }

        //Case b
        /*if(dis.equalsIgnoreCase("testing") ){
            WebElement discount = driver.findElement(By.xpath("//span[contains(text(),'- $5.00')]"));
            String a = discount.getTagName();
            if(a.equals("-$5.00")){
                System.out.println("PASS");
            }

        }else{
            System.out.println("FALSE");
        }*/



    }


}