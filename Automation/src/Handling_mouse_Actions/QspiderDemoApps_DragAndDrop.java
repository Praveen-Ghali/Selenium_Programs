package Handling_mouse_Actions;
//WAS drag and drop Mobile and Laptop accessories without using dragAndDrop() method of Action class:
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class QspiderDemoApps_DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Drag Position")).click();
		Thread.sleep(2000);
		Actions a=new Actions(driver);
		//Mobile Accessories
		WebElement target1 = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
		WebElement target2 = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		WebElement dest1 = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		a.clickAndHold(target1).moveToElement(dest1).release().perform();
		a.clickAndHold(target2).moveToElement(dest1).release().perform();
		//Laptop Accessories
		WebElement target3 = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
		WebElement target4 = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
		WebElement dest2 = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
		a.clickAndHold(target3).moveToElement(dest2).release().perform();
		a.clickAndHold(target4).moveToElement(target4).release().perform();
		Thread.sleep(5000);
		driver.quit();
		 
	}

}
