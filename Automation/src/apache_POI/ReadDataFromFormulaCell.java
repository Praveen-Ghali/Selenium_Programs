package apache_POI;
//CLASS:03
//WAS to to read data from formula cell:(Excel file already existed)
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromFormulaCell {

	public static void main(String[] args) throws IOException {
		FileInputStream file=new FileInputStream("./Data/readformula.xlsx");
		Workbook workbook = WorkbookFactory.create(file);
		//XSSFWorkbook workbook = new XSSFWorkbook(file);
		Sheet sheet = workbook.getSheet("Sheet1");	
		int rows = sheet.getLastRowNum();
		int cols = sheet.getRow(0).getLastCellNum();
		for (int i = 0; i < rows; i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < cols; j++) {
				Cell cell = row.getCell(j);
				switch (cell.getCellType()) {
				case STRING:System.out.print(cell.getStringCellValue());
				break;
				case NUMERIC:System.out.print(cell.getNumericCellValue());
				break;
				case FORMULA:System.out.print(cell.getNumericCellValue());
				break;
				default :System.out.print(cell.getBooleanCellValue());
			}
				System.out.print("|");
			}
			System.out.println();
		}
		file.close();
	}

}
