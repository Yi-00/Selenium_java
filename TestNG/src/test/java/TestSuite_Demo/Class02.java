package TestSuite_Demo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Udemy: 109: TestSuite
 * Giúp chạy được nhiều class 1 lúc
 */
public class Class02 {
    @BeforeMethod
    public void setUp() {
    }

    @Test
    public void test(){
        System.out.println("---Class Demo 02---");
    }

    @AfterMethod
    public void tearDown() {
    }
}
