package apache_POI;
//CLASS:05
//WAS To read data from Password protected Excel File:

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Reading_PasswordProtected_ExcelData {


	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./Data/CustomerDetails.xlsx");
		String pwd="shiva";
		Workbook workbook = WorkbookFactory.create(fis, pwd);
		Sheet sheet = workbook.getSheetAt(0);
		int rows = sheet.getLastRowNum();//Get all rows count
		short cols = sheet.getRow(0).getLastCellNum();//Get columns count
		System.out.println(rows);//rows count=10-->Started from 0
		System.out.println(cols);//cols count=3--->Started from 1
		
		
		//USING FOR LOOP:
		/*for (int r = 0; r <= rows; r++) {
			Row row = sheet.getRow(r);//To get individual row
			for (int c = 0; c < cols; c++) {
				Cell cell = row.getCell(c);//To get individual cell
				switch (cell.getCellType()) {//To check cell type
				case STRING:System.out.print(cell.getStringCellValue());
					break;
				case NUMERIC:System.out.print(cell.getNumericCellValue());
					break;
				default:System.out.print(cell.getBooleanCellValue());
					break;
				}
				System.out.print("|");
			}
			System.out.println();
		}
		workbook.close();
		fis.close();*/
		
		
		//USING iterator() METHOD:
		Iterator<Row> iterator = sheet.iterator();//To get all rows from sheet
		while (iterator.hasNext()) {//To check sheet having row
			Row row = (Row) iterator.next();//To get each individual row:
			Iterator<Cell> cellIterator = row.cellIterator();//To get all cells from individual row:
			while (cellIterator.hasNext()) {//To check row having cell:
				Cell cell = cellIterator.next();//To get individual cell:
				switch (cell.getCellType()) {//To check cell type
				case STRING:System.out.print(cell.getStringCellValue());
					break;
				case NUMERIC:System.out.print(cell.getNumericCellValue());
					break;
				default:System.out.print(cell.getBooleanCellValue());
					break;
				}
				System.out.print("|");
			}
			System.out.println();
		}
		workbook.close();//It will close workbook:
		fis.close();//It will close file:
	}

}
