package handling_Child_Pop_Ups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_Address_Of_All_Browser {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://secure.indeed.com/");
		driver.findElement(By.id("login-google-button")).click();
		driver.findElement(By.id("apple-signin-button")).click();
		Set<String> allAddress = driver.getWindowHandles();
		for (String address : allAddress) {
			System.out.println(address);
			driver.quit();
		}
	
	}

}
