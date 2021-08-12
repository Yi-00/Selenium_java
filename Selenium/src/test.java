import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.jar.JarOutputStream;

public class test {
    WebDriver driver;
    JavascriptExecutor js;
    String url;

    @BeforeEach
    void setUp() {
//        System.setProperty("webdriver.chrome.driver", "C:\\QA\\OCG\\QAFinalTest\\Driver\\chromedriver.exe");
        driver = new ChromeDriver();
        url = "https://au-webhook-adc1.onshopbase.com/";
        js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();
    }

    @Test
    void testShop() throws InterruptedException {
        //Load url
        driver.get(url);

        //Xác nhận Shop
        String title = driver.getTitle();
        Assertions.assertEquals("au-webhook-adc1", title, "\n This is not the page you want to Login ! \n");
        System.out.println("Check title: Passed");

        //Search product
        clickElement("//i[@class='material-icons' and text()='search']");
        //Trong hộp tìm kiếm -> input "Medical Termometr Baby Infrared Fever"
        inputValue("//input[@id='search']", "Medical Termometr Baby Infrared Fever");
        Thread.sleep(3000);

//        //Cuận trang web xuống 10 lần
//        scrollDown(10);

        //Click chọn sản phẩm vừa tìm kiếm
        clickElement("//img[@class='has-ratio product-image__content sb-lazy']");

        Thread.sleep(3000);
        //Xác nhận lại tên sản phẩm vừa chọn
        String verify_name = getElement("//h1[normalize-space()='Medical Termometr Baby Infrared Fever']").getText().trim();
        System.out.println("Product's name: " + verify_name);
        Assertions.assertEquals("Medical Termometr Baby Infrared Fever", verify_name, "\n Product name is not math");
        System.out.println("Check product's name: Passed");

        //Click Add to cart ( Khi đã check verify đúng sản phẩm )
        clickElement("//button[@id='add-to-cart']");

        //Cuận trang web xuống 15 lần
        scrollDown(15);
        Thread.sleep(3000);
        //Click Checkout
        clickElement("//button[@name='checkout']");
        Thread.sleep(3000);


        /* Contact information */
        //Enter email
        inputValue("//input[@id='checkout_shipping_address_email']", "quan_testter@gmail.com");
        //Click "Keep me up to date on news and exclusive offers"
        clickElement("//*[@id=\"accept-marketing\"]/span[1]");

        /* Shipping address */
        //Enter first name
        inputValue("//input[@id='checkout_shipping_address_first_name']", "Quan222");
        //Enter last name
        inputValue("//input[@id='checkout_shipping_address_last_name']", "Quan");
        //Enter address
        inputValue("//input[@id='checkout_shipping_address_address_line1']", "130 Trung Phung, Dong Da, HA NOI");
        //Cuận trang web xuống 10 lần
        scrollDown(10);
        //Enter Apartment
        inputValue("//input[@id='checkout_shipping_address_address_line2']", "1/2/130 Trung Phung, Dong Da, HA NOI");
        //Enter City
        inputValue("//input[@id='checkout_shipping_address_city']", "HA NOI");
        //Enter zipcode
        inputValue("//input[@id='checkout_shipping_address_zip']", "10000");
        //Enter phone
        inputValue("//input[@id='checkout_shipping_address_phone']", "0347621");
        //Click save this infomation for next time
        clickElement("//*[@id=\"checkout_shipping_address_remember_me\"]/span[1]");
        //Enter discount
        inputValue("//input[@placeholder='Enter your discount code here']", "TESTING");
        //Click "Continue to shipping method" Button
        clickElement("//button[normalize-space()='Continue to shipping method']");

        Thread.sleep(3000);
        //Click "Continue to payment method" Button
        clickElement("//button[normalize-space()='Continue to payment method']");

        //Cuận xuống cuối trang web
//        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        /* Payment method */
        Thread.sleep(4000);
        //Enter Card number   ->>>> Chưa find được
//        switchToFrame(0,"//input[@name='cardnumber' and @placeholder='Card number']", "4242 4242 4242 4242");

        //Chưa tìm được iframe Card number, card's expiration date, card's security code
        System.out.println("\n Chưa tìm được iframe để điền thông tin thẻ \n");


        //Enter Card's name
        inputValue("//*[@id=\"checkout\"]/div[2]/div/div[1]/div[2]/div/div/div[2]/div[1]/div[2]/fieldset/div[2]/div/div/div[2]/div/div[1]/input", "NGUYEN QUAN");
        Thread.sleep(3000);

        //Chuyển về trang chủ để check order
        driver.navigate().to("https://accounts.shopbase.com/sign-in");
        //Enter Email
        inputValue("//input[@id='email']", "shopbase2@beeketing.net");
        //Enter Password
        inputValue("//input[@id='password']", "*esAS!z(:YeZ-5q");
        //Click login button
        clickElement("//div[@class='ui-stack-login']");

        //Cuan trang web
        js.executeScript("window.scrollBy(0, 9930);");
        clickElement("//span[normalize-space()='au-webhook-adc1.onshopbase.com']");

        //click "Orders to fullfil"
        clickElement("//*[@id=\"app\"]/div/main/div/div/div/div/div[3]/div[1]/div/div/div");
        //click order want to check
        clickElement("(//span[@class='order-customer-name money--gray' and normalize-space()='Quan222 Quan'])[1]");


        //Chưa check được order
/*        Thread.sleep(3000);
        //Check order name
        String order_name = getElement("//a[normalize-space()='Medical Termometr Baby Infrared Fever']").getText().trim();
        Assertions.assertEquals("Medical Termometr Baby Infrared Fever", order_name, "\n Order name is not math");
        System.out.println("Check order name: Passed");
        //Cuận trang xuống 10 lần
//        scrollDown(10);
        //Check Discount
        String discount = getElement("//*[@id=\"app\"]/div/main/div/div/div/form/div[2]/div/div[1]/div[2]/section/div[2]/table/tbody[1]/tr/td[3]/span").getText().strip();
        Assertions.assertEquals("-$5.00", discount);
        System.out.println("Check Discount: Passed");
        //Check Skipping
        String shipping = getElement("/html/body/div[1]/div/main/div/div/div/form/div[2]/div/div[1]/div[2]/section/div[2]/table/tbody[3]/tr/td[3]/span").getText().strip();
        Assertions.assertEquals("$6.99", shipping);
        System.out.println("Check Shipping: Passed");
        //Check Total
        String total = getElement("//*[@id=\"app\"]/div/main/div/div/div/form/div[2]/div/div[1]/div[2]/section/div[2]/table/tbody[4]/tr/td[2]/div").getText().strip();
        Assertions.assertEquals("$18.98", total);
        System.out.println("Check Total: Passed");*/


    }

    public void waitElementVisible(String xpath){
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(xpath)));
    }

    public WebElement getElement(String xpath){
        return driver.findElement(By.xpath(xpath));
    }

    public void clickElement(String xpath){
        waitElementVisible(xpath);
        getElement(xpath).click();
    }

    public void inputValue(String xpath, String value){
        waitElementVisible(xpath);
        WebElement e = getElement(xpath);
        e.clear();
        e.sendKeys(value);
    }

    //Switch to iFrame
    public void switchToFrame(int index, String xpath, String value){
        driver.switchTo().frame(index);
        driver.findElement(By.xpath(xpath)).sendKeys(value);
        driver.switchTo().defaultContent();
    }

    //Switch to iFrame
    public void switchToFrame(String nameOrId, String xpath, String value){
        driver.switchTo().frame(nameOrId);
        driver.findElement(By.xpath(xpath)).sendKeys(value);
        driver.switchTo().defaultContent();
    }

    //Cuận màn hình xuống index lần
    public void scrollDown(int index){
        for(int i = 0; i < index; i++){
            WebElement body_ele = driver.findElement(By.xpath("//body"));
            body_ele.sendKeys(Keys.DOWN);
        }
    }

    @AfterEach
    void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
        driver.quit();
    }
}