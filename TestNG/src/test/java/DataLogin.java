import org.testng.annotations.DataProvider;

public class DataLogin {
    @DataProvider(name = "login")
    public Object[][] getData(){
        return new Object[][]{
                {"Admin", "admin123"}
        };
    }


}
