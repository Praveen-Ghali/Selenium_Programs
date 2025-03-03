package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoCssSelector {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Praveen%20M%20Ghali/OneDrive/Desktop/Demo.html");
		//driver.manage().window().maximize();
		//driver.findElement(By.tagName("a")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[href='https://qspiders.com/']")).click();
		Thread.sleep(2000);
		System.out.println("01");
		driver.navigate().back();
		driver.findElement(By.cssSelector("a[id='d1']")).click();
		Thread.sleep(2000);
		System.out.println("02");
		driver.navigate().back();
		driver.findElement(By.cssSelector("a[name='n1']")).click();
		Thread.sleep(2000);
		System.out.println("03");
		driver.navigate().back();
		driver.findElement(By.cssSelector("a[class='c1']")).click();
		Thread.sleep(2000);
		System.out.println("04");
		driver.quit();
	
	}

}
