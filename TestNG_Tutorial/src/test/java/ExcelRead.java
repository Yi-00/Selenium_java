import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * Udemy: 142: cách đọc file excel ( dùng poi apache )
 */

public class ExcelRead {
    public static void main(String[] args) {
        //Step 1:
        XSSFWorkbook workbook;          //Nhận biết workbook ???
        XSSFSheet sheet;                //Nhận biết sheet trong excel file
        XSSFCell cell;                  //Nhận biết hàng trong bảng của excel file

        //Step 2: đường dẫn đến excel file
        String path = "C:\\QA\\Selenium_java\\TestNG_Tutorial\\src\\main\\resources\\ReadDataDemo.xlsx";
        //Step 3: tên Sheet sẽ đọc
        String sheetName = "Sheet1";


    }
}
