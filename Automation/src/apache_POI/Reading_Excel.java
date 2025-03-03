package apache_POI;
//CLASS:01
//WAS to read the data from the excel file by using XSSFWorkbook class:

import java.io.FileInputStream;
import java.io.IOException;

//import org.apache.poi.xssf.usermodel.XSSFCell;
//import org.apache.poi.xssf.usermodel.XSSFRow;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.*;

public class Reading_Excel {

	public static void main(String[] args) throws IOException {
		 String excelPath=".\\data\\apache.xlsx";
		//String excelPath = "./data/apache.xlsx";
		FileInputStream fis = new FileInputStream(excelPath);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		int rows = sheet.getLastRowNum();
		short cols = sheet.getRow(1).getLastCellNum();
		for (int i = 0; i < rows; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < cols; j++) {
				XSSFCell cell = row.getCell(j);
				switch (cell.getCellType()) {
				case STRING:
					System.out.print(cell.getStringCellValue());
					break;
				case NUMERIC:
					System.out.print(cell.getNumericCellValue());
				// case BOOLEAN: System.out.println(cell.getBooleanCellValue());
					break;
				default:System.out.println(cell.getBooleanCellValue());
					break;

				}
				System.out.print("|");
			}
			System.out.println();
		}
	}
}
