/**
 * Udemy: 106
 */

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assert_Demo {
    @BeforeMethod
    public void setUp() {
    }

    @Test
    public void testNum(){
        Assert.assertEquals(10, 10, "Hai số khác nhau");
    }

    @Test
    public void testArray(){
        int[] a = {1,2};
        int[] b = {1,2};
        Assert.assertEquals(a, b, "Hai mảng không bằng nhau");
    }

    @AfterMethod
    public void tearDown() {
    }
}
