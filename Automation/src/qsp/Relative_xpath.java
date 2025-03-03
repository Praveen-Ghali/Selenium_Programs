package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relative_xpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Praveen%20M%20Ghali/OneDrive/Desktop/Demo.html");
		driver.findElement(By.xpath("//div[1]/a[1]")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		System.out.println("link-1");
		driver.findElement(By.xpath("//div[1]/a[2]")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		System.out.println("link-2");
		driver.findElement(By.xpath("//div[2]/a[1]")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		System.out.println("link-3");
		driver.findElement(By.xpath("//div[2]/a[2]")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		System.out.println("link-4");
		driver.findElement(By.xpath("//a")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		System.out.println("link-1,2,3,4");
		driver.findElement(By.xpath("//div[1]/a")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		System.out.println("link-1,2");
		driver.findElement(By.xpath("//div[2]/a")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		System.out.println("link-2,4");
		driver.findElement(By.xpath("//div/a[1]")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		System.out.println("link-1,3");
		driver.findElement(By.xpath("//div/a[2]")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		System.out.println("link-2,4");
		driver.findElement(By.xpath("//div[1]/a[1]|//div[2]/a[2]")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		System.out.println("link-1,4");
		driver.findElement(By.xpath("//div[1]/a[2]|//div[2]/a[1]")).click();
		System.out.println("link-2,3");
		driver.quit();
	}

}
