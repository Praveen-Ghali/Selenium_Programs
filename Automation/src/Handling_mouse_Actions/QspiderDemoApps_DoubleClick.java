package Handling_mouse_Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class QspiderDemoApps_DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//section[text()='Button']")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//a[text()='Double Click']")).click();
		driver.findElement(By.linkText("Double Click")).click();
		Thread.sleep(3000);
		Actions a=new Actions(driver); 
		WebElement target2 = driver.findElement(By.xpath("//button[text()='Yes']"));
		a.doubleClick(target2).perform();
		Thread.sleep(3000);
		//String text = driver.findElement(By.xpath("(//p[contains(text(),'registration process?')])[1]/../span")).getText();
		String text1 = driver.findElement(By.xpath("(//span)[2]")).getText();
		System.out.println(text1);
		if (text1.contains("Yes")) {
			System.out.println(" 'You selected Yes is' displayed");
		}
		else {
			System.out.println("You selected Yes is not displayed");
		}
		//driver.quit();
		
	}

}
