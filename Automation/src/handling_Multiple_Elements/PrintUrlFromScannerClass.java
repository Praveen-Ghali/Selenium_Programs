package handling_Multiple_Elements;
//TO PRINT URL FROM IN CONSOLE TO GET ALL THE LINKS IN THE AMAZON HOME PAGE:
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintUrlFromScannerClass {

	public static void main(String[] args) {
		System.out.println("Enter the URL");
		Scanner sc=new Scanner(System.in);
		String url=sc.nextLine();
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		int count = allLinks.size();
		System.out.println(count);
		for (int i = 0; i < count; i++) {
			WebElement link = allLinks.get(i);
			String text = link.getText();
			System.out.println(text);
			
		}
		driver.quit();
	}

}
