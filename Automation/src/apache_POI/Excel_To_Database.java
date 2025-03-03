package apache_POI;

//CLASS:09
//WAS TO READ DATA FROM THE EXCEL AND WRITE INTO DATABASE.

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_To_Database {

	public static void main(String[] args) throws SQLException, IOException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qspider", "root", "Praveen@123#");
		Statement stmt = con.createStatement();//WE USE createStatement() method to create new table.
		
		//CREATE NEW TABLE IN DATABASE.
		String sql="create table bookprice(BookName varchar(25),Price int)";//WE WRITTEN QUERY TO CREATE TABLE.
		stmt.execute(sql);//EXECUTE THE STATEMENT TO CREATE TABLE "bookprice".
		
		//READ DATA FROM EXCEL:
		FileInputStream fis =new FileInputStream("./Data/BooksPrice.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		int rows = sheet.getLastRowNum();
		XSSFRow row = null;
		for (int i = 1; i < rows; i++) {
			row = sheet.getRow(i);
			String bookName = row.getCell(0).getStringCellValue();
			double price = row.getCell(1).getNumericCellValue();
			//INSERT DATA INTO DATABASE TABLE.
			sql="insert into bookprice values('"+bookName+"','"+price+"')";
			stmt.execute(sql);
			stmt.execute("commit");//TO MAKE DATA PERMANENT IN THE DATABABASE.
			
		}
		workbook.close();
		fis.close();
		con.close(); 
		System.out.println("We successfully added data to the Database");
		
	}

}
