//Cách tạo JUnit

package JUnit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JUnit_create_Test {


    //setUp
    @org.junit.jupiter.api.BeforeEach
    void setUp() throws Exception{
        System.out.println("==Before==");
    }

    //tearDown
    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        System.out.println("==After==");
    }

    //cách 1: public void name()....
    @Test
    public void test_1(){
        Assertions.assertEquals(1,2);
    }

    //cách 2: void name()....
    @Test
    void test_2(){
        Assertions.assertNotEquals(2,2);
    }
}