package TestSuite_Demo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Udemy: 109: TestSuite
 */
public class Class01 {
    @BeforeMethod
    public void setUp() {
    }

    @Test
    public void test(){
        System.out.println("---Class Demo 01---");
    }

    @AfterMethod
    public void tearDown() {
    }
}
