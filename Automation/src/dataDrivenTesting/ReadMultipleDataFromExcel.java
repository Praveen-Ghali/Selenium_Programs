package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/apache.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		
		int count = wb.getSheet("Sheet1").getLastRowNum();
		//System.out.println(count);
		for (int i = 1; i <= count; i++) {
			String un = wb.getSheet("Sheet1").getRow(i).getCell(0).getStringCellValue();
			String pwd = wb.getSheet("Sheet1").getRow(i).getCell(1).getStringCellValue();
			String mail = wb.getSheet("Sheet1").getRow(i).getCell(2).getStringCellValue();
			System.out.println(un+"	"+pwd+"	"+mail);
			
		}
	}
 
}
