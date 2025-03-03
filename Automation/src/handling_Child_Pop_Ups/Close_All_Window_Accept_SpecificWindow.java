package handling_Child_Pop_Ups;

import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close_All_Window_Accept_SpecificWindow {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		System.out.println("Enter specific title window name that should not close");
		Scanner sc=new Scanner(System.in);
		String spTitle = sc.nextLine();
		driver.get("https://secure.indeed.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("login-google-button")).click();
		driver.findElement(By.id("apple-signin-button")).click();
		Set<String> allWAddress = driver.getWindowHandles();
		for (String address : allWAddress) {
			driver.switchTo().window(address);
			String eTitle = driver.getTitle();
			if (!(eTitle.contains(spTitle))) {
				driver.close();
			}
		}
	}

}
