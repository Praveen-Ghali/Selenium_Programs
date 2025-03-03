package qsp;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Demo {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver2=new FirefoxDriver();
		driver.get("https://www.instagram.com");

		String title = driver.getTitle();
		System.out.println(title);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//driver2.quit()
		 //driver2.close();
	}

}
