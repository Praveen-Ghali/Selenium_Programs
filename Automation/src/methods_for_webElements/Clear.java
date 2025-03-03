package methods_for_webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Praveen%20M%20Ghali/OneDrive/Desktop/Demo.html");
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("pmg@123#");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).clear();
		Thread.sleep(2000);
	}

}
