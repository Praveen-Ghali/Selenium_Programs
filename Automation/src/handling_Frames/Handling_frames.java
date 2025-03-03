package handling_Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_frames {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/Praveen%20M%20Ghali/OneDrive/Desktop/Page1.html");
		driver.findElement(By.id("t1")).sendKeys("A");
		driver.switchTo().frame(0);	//frame(index)
		driver.findElement(By.id("t2")).sendKeys("B");
		driver.switchTo().parentFrame();//it will switch to parent
		driver.findElement(By.id("t1")).sendKeys("C");
		driver.switchTo().frame("f1");//frame(String)
		driver.findElement(By.id("t2")).sendKeys("D");
		driver.switchTo().defaultContent();//it will come out from all frame to Parent frame
		driver.findElement(By.id("t1")).sendKeys("E");
		WebElement f = driver.findElement(By.id("f1"));
		driver.switchTo().frame(f);//frame(webElement)
		driver.findElement(By.id("t2")).sendKeys("F");
		driver.quit();
		
	}

}
