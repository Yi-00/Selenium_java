/**
 * Udemy: 107
 * SoftAssert : 1 lần thực hiện Assert bình thường -> nếu fail -> chương trình code sẽ dừng ngay
 * Nhưng nếu dùng SoftAssert có thể lấy ra toàn bộ Asert sau đó -> dù Asert trước đó fail
 */

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert_Demo {
    @BeforeMethod
    public void setUp() {
    }

    @Test
    public void test(){
        SoftAssert sa = new SoftAssert();
        int a = 1;
        sa.assertEquals(a,1);
        sa.assertEquals(a, 2, "Hai so khong bang nhau");
        System.out.println("Asert đầu tiên fail nhưng code này vẫn được in ra");
        //xác nhận xem có asert nào fail: .assertAll()
        sa.assertAll();
    }

    @AfterMethod
    public void tearDown() {
    }
}
