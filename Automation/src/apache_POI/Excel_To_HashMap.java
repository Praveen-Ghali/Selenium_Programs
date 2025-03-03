package apache_POI;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

//CLASS:07
//WAS to read data from the excel and store it in the HashMap:
public class Excel_To_HashMap {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./Data/Student.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		//XSSFWorkbook workbook=new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheetAt(0);
		int rows = sheet.getLastRowNum();
		short cols = sheet.getRow(1).getLastCellNum();
		//System.out.println(rows);
		//System.out.println(cols);
		HashMap<Integer, String> data =new HashMap<>();
		
		//READING DATA FROM EXCEL TO HashMap:
		for (int i = 0; i < rows; i++) {
				int key = (int) sheet.getRow(i).getCell(0).getNumericCellValue();
				String value = sheet.getRow(i).getCell(1).getStringCellValue();
				data.put((int) key, value);
			}
		//READ DATA FROM HashMap
		for (Map.Entry entry:data.entrySet()) {
			System.out.println(entry.getKey()+"  "+ entry.getValue());
		}
		
		
	}

}
