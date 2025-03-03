package dataDrivenTesting;
//WAS to read data from the excel file:
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandlingExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/Test case for API.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		//Workbook wb = WorkbookFactory.create(fis);
		String data1 = wb.getSheet("Sheet1").getRow(31).getCell(1).getStringCellValue();
		System.out.println(data1);
	
	}

}
