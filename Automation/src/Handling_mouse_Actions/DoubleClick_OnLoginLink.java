package Handling_mouse_Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick_OnLoginLink {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.vtiger.com/");
		WebElement target = driver.findElement(By.partialLinkText("Login"));
		Thread.sleep(3000);
		Actions a=new Actions(driver);
		a.doubleClick(target).perform();
		String Wh = driver.getWindowHandle();
		//driver.switchTo().window(Wh);
		String title = driver.getTitle();
		//System.out.println(title);
		if (title.equals("Login - Vtiger")) {
			System.out.println("Login page displayed");
		}
		else {
			System.out.println("Login page not displayed");
		}
		//driver.quit();
	}

}
 