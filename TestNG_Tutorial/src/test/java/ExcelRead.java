import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Udemy: 142: cách đọc file excel ( dùng poi apache )
 */

public class ExcelRead {
    public static void main(String[] args) {
        //Step 1:
        XSSFWorkbook workbook;          //Nhận biết workbook ???
        XSSFSheet sheet;                //Nhận biết sheet trong excel file
        XSSFCell cell;                  //Nhận biết oo trong bảng của excel file

        //Step 2: đường dẫn đến excel file
        String path = "C:\\QA\\Selenium_java\\TestNG_Tutorial\\src\\main\\resources\\ReadDataDemo.xlsx";

        //Step 3: tên Sheet sẽ đọc
        String sheetName = "Sheet1";

        //đọc file thông qua io     Udemy: 142 - 4p, try-catch ở đây ấn alt + enter sẽ tự động xuất hiện
        //nếu không tìm được file thì bắt exception
        try {
            FileInputStream excelFile = new FileInputStream(path);   //step 4: đường dẫn đến excel file
            workbook = new XSSFWorkbook(excelFile);                  //Step 5:  open excel file ( open workbook )
            sheet = workbook.getSheet(sheetName);                    //Step 6:  .getSheet(..) : open sheet
            cell = sheet.getRow(2).getCell(1);       //Step 7: .getRow(..) lấy hàng ngang, .getCell(..) lấy giá trị thứ n trong hàng
            String cellData = cell.getStringCellValue();            //Step 8: .getStringCellValue(), lấy data từ step 7
            System.out.println("cell data: " + cellData);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
