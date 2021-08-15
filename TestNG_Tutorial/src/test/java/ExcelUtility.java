import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Udemy: 143 -  dùng DataProvider của testNG đọc ra các dữ liệu trong file excel
 */
public class ExcelUtility {
    private static XSSFWorkbook workbook;
    private static XSSFSheet sheet;

    public static void setExcelFile(String path, String sheetName){
        try {
            //Open Excel file
            FileInputStream excelFile = new FileInputStream(path);

            //Access to excel sheet
            workbook = new XSSFWorkbook(excelFile);
            sheet = workbook.getSheet(sheetName);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
