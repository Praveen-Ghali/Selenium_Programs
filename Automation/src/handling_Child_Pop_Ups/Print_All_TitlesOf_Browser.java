package handling_Child_Pop_Ups;
//WAS to print Title of all browser present in the indeed after clicking on Google and apple button:
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_All_TitlesOf_Browser {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://secure.indeed.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("login-google-button")).click();
		driver.findElement(By.id("apple-signin-button")).click();
		Set<String> allAddress = driver.getWindowHandles();
		for (String address : allAddress) {
			driver.switchTo().window(address);
			String title = driver.getTitle();
			Thread.sleep(2000);
			System.out.println(title);
		}
		driver.quit();
	}

}
