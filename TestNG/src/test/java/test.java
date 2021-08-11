import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test {
    @BeforeMethod
    public void setUp() {
        System.out.println("1");
    }

    @Test
    public void test(){
        System.out.println("x");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("tearDown");
    }
}
