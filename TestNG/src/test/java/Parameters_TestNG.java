import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Udemy: 118:  Đọc tham số trong file .xml
 */
public class Parameters_TestNG {
    @BeforeMethod
    @Parameters({"browser", "platform"})       //Đọc param "browser", " platform" từ file Parameters_testNG.xml
    public void setUp(String browser, String platform) {
        System.out.println("browser: " + browser);
        System.out.println("platform: " + platform);
    }

    @Test
    @Parameters({"response"})                  //Đọc param "respone" từ file Parameters_testNG.xml
    public void test(int response){
        System.out.println("response" + response);
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("tearDown: Parameter");
    }
}
