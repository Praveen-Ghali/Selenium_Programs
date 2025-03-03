package handling_Child_Pop_Ups;
//WAS to close specific window of the browser:
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close_Only_Specific_Browser {

	public static void main(String[] args) {
		System.out.println("Enter browser title name to close");
		Scanner sc=new Scanner(System.in);
		String eTitle = sc.nextLine();
		WebDriver driver=new ChromeDriver();
		driver.get("https://secure.indeed.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("login-google-button")).click();
		driver.findElement(By.id("apple-signin-button")).click();
		Set<String> allWAddress = driver.getWindowHandles();
		for (String address : allWAddress) {
			driver.switchTo().window(address);//Swith to specific browser to get title of it.
			String aTitle = driver.getTitle();
			if (aTitle.contains(eTitle)) {
				driver.close();
			}
		}
		System.out.println("Google child window closed");
	}

}
