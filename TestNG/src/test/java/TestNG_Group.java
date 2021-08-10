import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Udemy: 112 + 114
 * Tạo nhóm khi test  ( thích hợp với regression testing )
 */
public class TestNG_Group {
    @BeforeMethod
    public void setUp() {
    }

    //Tạo nhóm: với 2 nhóm tên lần lượt là: cars và Group1
    @Test(groups = {"cars", "Group1"})
    public void testBMW(){
        System.out.println("Running test - BWM");
    }

    //test này trong nhóm tên: cars
    @Test(groups = {"cars"})
    public void testHonda(){
        System.out.println("Running test - Honda");
    }

    //Test này trong 2 nhóm tên cars và Group1
    @Test(groups = {"cars", "Group1"})
    public void testAudi(){
        System.out.println("Running test - Audi");
    }

    //test này chỉ trong 1 nhóm tên: bikes
    @Test(groups = {"bikes"})
    public void testNinja(){
        System.out.println("Running test - Ninja");
    }

    @AfterMethod
    public void tearDown() {
    }
}
