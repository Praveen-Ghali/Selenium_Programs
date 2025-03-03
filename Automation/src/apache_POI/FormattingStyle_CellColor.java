package apache_POI;
//CLASS:06
//WAS To fill background Foreground colors to cell:

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FormattingStyle_CellColor {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Sheet1");
		XSSFRow row = sheet.createRow(0);
		
		//SETTING BACKGROUND COLOR:
		XSSFCellStyle style = workbook.createCellStyle();
		style.setFillBackgroundColor(IndexedColors.BRIGHT_GREEN.getIndex());
		style.setFillPattern(FillPatternType.BIG_SPOTS);
		XSSFCell cell = row.createCell(0);
		cell.setCellValue("Welcome");
		cell.setCellStyle(style);
		
		//SETTING FOREGROUND COLOR:
		style = workbook.createCellStyle();
		style.setFillForegroundColor(IndexedColors.YELLOW.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		XSSFCell cell1 = row.createCell(1);
		cell1.setCellValue("Automation");
		cell1.setCellStyle(style);

		
		FileOutputStream fos=new FileOutputStream("./Data/Styles.xlsx");
		workbook.write(fos);
		workbook.close();
		fos.close();
		System.out.println("Style applied successfully");
		
	}

}
