package handling_Child_Pop_Ups;
//WAS to close all browsers(windows) without using quit() method:
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close_AllBrowser_Without_Using_quitMethod {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://secure.indeed.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("login-google-button")).click();
		driver.findElement(By.id("apple-signin-button")).click();
		Set<String> allAddress = driver.getWindowHandles();
		for (String address: allAddress) {
			driver.switchTo().window(address);
			driver.close();
		}
	}

}
