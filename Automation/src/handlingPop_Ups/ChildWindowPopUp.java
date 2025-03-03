package handlingPop_Ups;

//WAS to print address of all browser present in the indeed after clicking Continue with Google and Continue with apple
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopUp {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://secure.indeed.com/");
		//String wh = driver.getWindowHandle();//It will return single address
		driver.findElement(By.id("login-google-button")).click();
		driver.findElement(By.id("apple-signin-button")).click();
		Set<String> whs = driver.getWindowHandles();//Set wiil not return/store address in order:
		int count = whs.size();
		System.out.println(count);
		for (String string : whs) {
			System.out.println(string);
		}
		driver.quit();
	}

}
