package handlingPop_Ups;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Upload_Pop_Up {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/Praveen%20M%20Ghali/OneDrive/Desktop/HTML/Listbox.html");
		Thread.sleep(3000);
		File f=new File("./Data/Mr.Praveen.docx");
		String abPath = f.getAbsolutePath();
		System.out.println(abPath);
		driver.findElement(By.id("cv")).sendKeys(abPath);
		System.out.println("File successfully uploaded");
		driver.quit();
	
	}

}
