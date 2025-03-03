package apache_POI;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteFormulaCell_01 {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Numbers");
		XSSFRow row = sheet.createRow(0);
		//To pass value to cell 0,1 and 2
		row.createCell(0).setCellValue(10);
		row.createCell(1).setCellValue(20);
		row.createCell(2).setCellValue(30);
		//To do calculation and write value of calculation
		row.createCell(3).setCellFormula("A1*B1*C1/2");
		
		FileOutputStream fos=new FileOutputStream("./Data/calc.xlsx");
		workbook.write(fos);
		fos.close();
		System.out.println("calc.xlsx created with formula");
	}

}
