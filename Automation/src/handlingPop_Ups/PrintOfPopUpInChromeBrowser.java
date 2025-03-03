package handlingPop_Ups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintOfPopUpInChromeBrowser {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/downloads/");
		driver.manage().window().maximize();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_P);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		for (int i = 0; i < 6; i++) {
			r.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
		}
		for (int i = 0; i < 3; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(1000);
		}
		r.keyPress(KeyEvent.VK_1);	
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_MINUS);	
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_3);	
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_S);
		r.keyPress(KeyEvent.VK_E);
		r.keyPress(KeyEvent.VK_L);
		r.keyPress(KeyEvent.VK_E);
		r.keyPress(KeyEvent.VK_N);
		r.keyPress(KeyEvent.VK_I);
		r.keyPress(KeyEvent.VK_U);
		r.keyPress(KeyEvent.VK_M);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_ENTER);
		driver.quit();
		
		//r.keyPress(KeyEvent.VK_ENTER);
		//WebElement pageList = driver.findElement(By.xpath("//select[@class='md-select']"));
		//WebElement pageList = driver.findElement(By.className("md-select"));
		//Select s=new Select(pageList);
		//s.selectByIndex(2);
	}

}
