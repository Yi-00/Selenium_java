import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Udemy: 122, 123
 * Khi ta muốn thay đổi data linh hoạt
 */
public class DataProviders_TestNG {
    @BeforeMethod
    public void setUp() {
    }

    @DataProvider(name="inputs")
    public Object[][] getData(){
        return new Object[][]{
                {"Quan", 21},
                {"Long", 22},
                {"Trang", 23}
        };
    }

    @Test(dataProvider = "inputs")
    public void test(String name, int age){
        System.out.println("My name is: " + name);
        System.out.println("I'm " + age + " years old.");
    }

    @AfterMethod
    public void tearDown() {
    }
}
