package HandlingScrollBarUsing_JavaScript;
//WAS to scroll 3000PX in the bbc.com
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BBC {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.bbc.com/");
		//JavascriptExecutor j=(JavascriptExecutor) driver;
		RemoteWebDriver r=(RemoteWebDriver) driver;		
		r.executeScript("window.scrollTo(0,3000)");
		Thread.sleep(2000);
		r.executeScript("window.scrollBy(0,3000)");
		r.close();
		
		
			
		
	}

}
