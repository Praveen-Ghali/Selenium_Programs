package apache_POI;
//CLASS:07
//WAS to read the data from HashMap and store it in the Excel:

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class HashMap_To_Excel {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("StudentData");
		
		HashMap<Integer, String> data=new HashMap<>();
		data.put(101, "Jhon");
		data.put(102, "Kim");
		data.put(103, "David");
		data.put(104, "Scott");
		data.put(105, "Smith");
		data.put(106, "Mary");
		
		int rowno=0;
		for ( Map.Entry entry:data.entrySet()) {
			//Map.Entry--> is used to encapsulate a single key-value pair.
			//data.entrySet()--> allows access to both keys and values simultaneously.
			//entry is the reference variable we storing Key and Value pair.
			
			XSSFRow row = sheet.createRow(rowno ++);
			Object key = entry.getKey();//Get the Key
			Object value = entry.getValue();//Get the value
			System.out.print(key);
			System.out.print("|");
			System.out.println(value);
			row.createCell(0).setCellValue((Integer)entry.getKey());//Here we did typecasting by using (Integer).
			row.createCell(1).setCellValue((String)entry.getValue());//Here we did typecasting by using (String).
		}
		FileOutputStream fos=new FileOutputStream("./Data/Student.xlsx");
		workbook.write(fos);
		fos.close();
		System.out.println("Student.xlsx created successfully");
		
	}

}
