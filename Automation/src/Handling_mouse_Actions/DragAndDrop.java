package Handling_mouse_Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		//WebElement src = driver.findElement(By.xpath("//div[@id='block-1']"));
		WebElement src = driver.findElement(By.xpath("//h1[text()='Block 1']"));
		//WebElement dest = driver.findElement(By.xpath("//div[@id='block-4']"));
		WebElement dest = driver.findElement(By.xpath("//h1[text()='Block 4']"));
		Actions a=new Actions(driver);
		a.dragAndDrop(src, dest).perform();
		driver.quit();
	}

}
