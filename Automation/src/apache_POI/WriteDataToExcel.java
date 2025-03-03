package apache_POI;
//CLASS:02
//WAS to create Excel file and write data of employees details:
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataToExcel {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook workbook=new XSSFWorkbook();//create excel workbook
		XSSFSheet sheet = workbook.createSheet("Emp Info");//create excel sheet inside workbook
		Object empdata[][]= { 	{"EmpId","Name","JobRole","Salary"},
								{"101","David","Engineer","$3500"},
								{"102","Smith","Manager","$5500"},
								{"103","Scott","Analyst","$6000"}
							};
		int rows = empdata.length;//To get no.of rows
		int cols = empdata[0].length;//To get no.of cols
		System.out.println(rows);
		System.out.println(cols);
		
		for (int i = 0; i < rows; i++) {
			XSSFRow row = sheet.createRow(i);//To create individual row
			for (int j = 0; j < cols; j++) {
				XSSFCell cell = row.createCell(j);//To create individual cell:
				Object value = empdata[i][j];//To get the value inside the cell but before write we need check its type:
				
				if (value instanceof String) {
					cell.setCellValue((String)value);
				}
				else if(value instanceof Integer){
					cell.setCellValue((Integer)value);
				}
				else if (value instanceof Boolean) {
					cell.setCellValue((Boolean) value);
				}
				
			}
			String filepathString=".\\data\\employee.xlsx";
			FileOutputStream fos=new FileOutputStream(filepathString);		
			workbook.write(fos);
			fos.close();
			
		}
		System.out.println("employee.xlsx file written successfully");
	}

}
