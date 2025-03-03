package apache_POI;

//CLASS:08
//WAS TO READ DATA FROM THE DATABASE(MySQL) AND WRITE IT INTO THE EXCEL SHEET:
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Database_To_Excel {

	public static void main(String[] args) throws SQLException, IOException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "Praveen@123#");

		// STATEMENT OR QUERY
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from actor");

		// CREATE EXCEL TO STORE DATA
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("actor data");
		// WRITING CLOUMN NAME IN THE FIRST ROW OF THE SHEET
		XSSFRow row = sheet.createRow(0);
		row.createCell(0).setCellValue("actor_id");
		row.createCell(1).setCellValue("first_name");
		row.createCell(2).setCellValue("last_name");

		// FROM FIRST ROW ONWARDS WE WRITING VALUES TO EACH CELL OF THE COLUMN.
		int r = 1;
		while (rs.next()) {// HERE WE CAPTURING DATA FROM ResultSet AND VARIFYING NEXT VARIABLE AVILABLE OR
							// NOT.
			int id = rs.getInt("actor_id");
			String fname = rs.getString("first_name");
			String lname = rs.getString("last_name");
			// CREATING NEW ROW AND UPDATING WITH VALUE IN EACH CELL.
			row = sheet.createRow(r++);
			row.createCell(0).setCellValue(id);
			row.createCell(1).setCellValue(fname);
			row.createCell(2).setCellValue(lname);

		}
		FileOutputStream fos = new FileOutputStream("./Data/Actor names.xlsx");
		workbook.write(fos);
		workbook.close();
		fos.close();
		con.close();
		System.out.println("Successfully we read the data from MySQL database to Excel");
	}

}
