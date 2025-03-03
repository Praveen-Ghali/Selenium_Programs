package handling_Multiple_Elements;
//PRINT ALL THE LINKS IN AMAZON HOME PAGE:
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllLinks {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
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
