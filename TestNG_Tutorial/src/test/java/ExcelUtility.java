/*
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

*/
/**
 * Udemy: 143 -  dùng DataProvider của testNG đọc ra các dữ liệu trong file excel
 *//*

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

    public static String[][] getTestData(String tableName){
        String[][] testData;
        try{
            //Sử lý dạng String, number trong ô xcel
            DataFormatter formatter = new DataFormatter();

            //mảng boundaryCells: đặt giá trị đầu tiên và cuối cùng của dòng
            //căn cứ vào dòng đầu tiên và cuối cùng, có thể biết được những dữ liệu nào được đọc
            XSSFCell[] boundaryCells = findCells(tableName);
        }
    }

    public static XSSFCell[] findCells(String tableName) {
        DataFormatter formatter = new DataFormatter();
        String pos = "begin";
        XSSFCell[] cells = new XSSFCell[2];   //2 là độ dài ( có 2 ô )

        for(Row row : sheet){
            for(Cell cell : row){
                //if (tableName.equals(cell.getStringCellValue()
                if(tableName.equals(formatter.formatCellValue(cell))){
                    if(pos.equalsIgnoreCase("begin")){
                        //
                        cells[0] = (XSSFCell) cell;
                        pos = "end";
                    }else {
                        //
                        cells[1] = (XSSFCell) cell;
                    }
                }
            }
        }
    }


}
*/
