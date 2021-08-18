import org.testng.annotations.DataProvider;

public class TestData_02 {
    @DataProvider(name = "login")
    public Object[][] getData(){
        return new Object[][]{
                {"Admin", "admin123"}
        };
    }


}
