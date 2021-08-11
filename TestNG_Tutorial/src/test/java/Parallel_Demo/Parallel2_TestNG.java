package Parallel_Demo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Udemy: 119: test song song
 * Nội dung class Parallel1_TestNG và Parallel2_TestNG là như nhau
 */
public class Parallel2_TestNG {
    @BeforeMethod
    public void setUp() {
    }

    @Test
    public void testMethod1() throws InterruptedException {
        System.out.println("TestNG Parallel : method 1");
        Thread.sleep(3000);
        System.out.println("More Steps 1");
    }


    @Test
    public void testMethod2() throws InterruptedException {
        System.out.println("TestNG Parallel : method 2");
        Thread.sleep(3000);
        System.out.println("More Steps 2");
    }


    @AfterMethod
    public void tearDown() {
    }
}
