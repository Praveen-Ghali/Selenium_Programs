package handling_Multiple_Elements;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoPageLoadTimeOut {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		try {
			driver.get("https://www.actitime.com/");
			System.out.println("Page loaded within 5 seconds");
		} catch (Exception e) {
			System.out.println("Page not loaded within 5 seconds");
		}
		driver.quit();
	}

}
