package apache_POI;
//CLASS:01
//WAS to read data from the excel by using WorkbookFactory class:
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.*;

public class ReadingExcelData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		String path="./data/apache.xlsx";
		//String path=".\\data\\apache.xlsx";
		FileInputStream fis=new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheetAt(0);
		
		Iterator<?> i = sheet.iterator();
		while (i.hasNext()) {
			Row row = (Row) i.next();
			Iterator<Cell> cellIterator = row.cellIterator();
			while(cellIterator.hasNext()) {
				Cell cell = cellIterator.next();
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


