import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DemoTest {

    @BeforeMethod
    public void setUp() {
    }

    @Test
    public void test(){
        int a = 10;
        Assert.assertEquals(10, a);
    }

    @AfterMethod
    public void tearDown() {
    }
}