import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Udemy: 112:   cách khống chế thứ tự các @Test
 * Bình thường sẽ chạy test theo thứ tự a->z, 0>9
 */
public class Priority_Demo {
    @BeforeMethod
    public void setUp() {
    }

    @Test(priority = 1)
    public void test02(){
        System.out.println("----02----");
    }

    @Test(priority = 2)
    public void test01(){
        System.out.println("----01----");
    }

    @Test(priority = 0)
    public void test03(){
        System.out.println("----03----");
    }

    @AfterMethod
    public void tearDown() {
    }
}
