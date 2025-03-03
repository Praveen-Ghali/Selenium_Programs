package apache_POI;
//Class:04
//WAS to calculate summation of book price(Excel sheet is already exists):
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteFormulaCell2 {

	public static void main(String[] args) throws IOException {
		String path="./Data/BooksPrice.xlsx";
		FileInputStream fis=new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		sheet.getRow(7).getCell(1).setCellFormula("SUM(B2:B7)");
		fis.close();
		FileOutputStream fos=new FileOutputStream(path);
		wb.write(fos);
		wb.close();
		fos.close();
		System.out.println("summation for book price is Done!!");
		
	}

}
