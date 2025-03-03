package Handling_mouse_Actions;
//WAS Login into the actiTIME without using findElement() method:
//hint:use activeElement() method and Robot class:

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.lang.annotation.Target;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UsageOf_ActiveElementMethod {

	public static void main(String[] args) throws AWTException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://localhost/login.do");
		driver.switchTo().activeElement().sendKeys("admin");
		//WebElement target = driver.findElement(By.id("username"));
		//Actions a=new Actions(driver);
		//a.contextClick(target).perform();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		driver.switchTo().activeElement().sendKeys("manager");
		r.keyPress(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_ENTER);
		driver.quit();
		
	}

} 
