package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText_PartialLinkText {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Praveen%20M%20Ghali/OneDrive/Desktop/Demo.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//driver.findElement(By.linkText("Qspider")).click();
		//Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Qsp")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("pider")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		//driver.findElement(By.partialLinkText("sir")).click();//NoSuchElementException:{"method":"partial link text","selector":"sir"}
		//Thread.sleep(2000);
		driver.quit();
	}

}
