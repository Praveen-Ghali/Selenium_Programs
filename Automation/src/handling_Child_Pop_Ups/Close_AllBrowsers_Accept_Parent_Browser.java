package handling_Child_Pop_Ups;
//WAS close all the windows of the browser accept parent window browser:
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close_AllBrowsers_Accept_Parent_Browser {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://secure.indeed.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("login-google-button")).click();
		driver.findElement(By.id("apple-signin-button")).click();
		String parentWadd = driver.getWindowHandle();
		Set<String> allAddress = driver.getWindowHandles();
		for (String address : allAddress) {
			if (!(address.equals(parentWadd))) {
				driver.switchTo().window(address);
				Thread.sleep(2000);
				driver.close();
			}
		}
	}

}
