import org.testng.annotations.DataProvider;

public class TestData_01 {
    @DataProvider(name="inputs")
    public Object[][] getData(){
        return new Object[][]{
                {"Quan", 21},
                {"Long", 22},
                {"Trang", 23}
        };
    }
}
