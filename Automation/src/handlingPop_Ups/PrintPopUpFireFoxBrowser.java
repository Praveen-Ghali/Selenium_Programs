package handlingPop_Ups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintPopUpFireFoxBrowser {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_P);	
		Thread.sleep(1000);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_TAB);	
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		for (int i = 0; i < 4; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(1000);
		}
		//Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_1);	
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_MINUS);	
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_2);	
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		//r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_S);
		r.keyPress(KeyEvent.VK_E);
		r.keyPress(KeyEvent.VK_L);
		r.keyPress(KeyEvent.VK_E);
		r.keyPress(KeyEvent.VK_N);
		r.keyPress(KeyEvent.VK_I);
		r.keyPress(KeyEvent.VK_U);
		r.keyPress(KeyEvent.VK_M);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		driver.quit();
		
	}

}
