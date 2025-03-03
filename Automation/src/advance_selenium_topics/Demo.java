package advance_selenium_topics;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		
		//GET TITLE WITHOUT USING getTitle() method:
		Object title = jse.executeScript("return document.title");//returns the title of the webpage.
		System.out.println(title);
		Object url = jse.executeScript("return document.URL");//returns the url of the webpage.
		System.out.println(url);
		//System.out.println(driver.getCurrentUrl());
		
		//PERFORM ACTIONS ON ELEMENT WITHOUT USING findElement() method:=>Here the action is perform where the cursor is present:
		driver.switchTo().activeElement().sendKeys("pmg@gmail.com");
		
		//GET TEXT FROM TEXTBOX:
		String text = driver.findElement(By.xpath("//input[@id='pass']")).getAttribute("placeholder");
		System.out.println(text);
		driver.quit();
		
	}
}
