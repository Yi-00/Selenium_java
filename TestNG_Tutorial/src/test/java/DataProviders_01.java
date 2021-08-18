import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Udemy: 123,  tách riêng data, tiếp theo của bài Udemy: 122
 * ( TestNG_Tutorial/src/test/java/DataProviders_TestNG.java )
 * Khi ta muốn thay đổi data linh hoạt
 */
public class DataProviders_01 {
    @BeforeMethod
    public void setUp() {
    }

//    @DataProvider(name="inputs")
//    public Object[][] getData(){
//        return new Object[][]{
//                {"Quan", 21},
//                {"Long", 22},
//                {"Trang", 23}
//        };
//    }

    //dataProvider: là tên dataProvider,  dataProviderClass : là tên class chứa data
    @Test(dataProvider = "inputs", dataProviderClass = TestData_01.class)
    public void test(String name, int age){
        System.out.println("My name is: " + name);
        System.out.println("I'm " + age + " years old.");
    }

    @AfterMethod
    public void tearDown() {
    }
}
