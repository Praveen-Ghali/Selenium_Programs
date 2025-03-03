package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VarifyUrlNavigation {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumhq.org/");
		String url=driver.getCurrentUrl();
		if (url.equals("https://www.selenium.dev/")) {
			System.out.println("url passed");
			
		}
		else {
			System.out.println("url failed");
		}
		driver.quit();
		
	}

}
