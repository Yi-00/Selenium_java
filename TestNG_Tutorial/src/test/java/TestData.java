import org.testng.annotations.DataProvider;

public class TestData {
    @DataProvider(name="inputs")
    public Object[][] getData(){
        return new Object[][]{
                {"Quan", 21},
                {"Long", 22},
                {"Trang", 23}
        };
    }
}
