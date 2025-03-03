package Handling_mouse_Actions;
//WAS to scroll to video link of the BBC.com and click on it:
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToParticularElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.bbc.com/");
		WebElement target = driver.findElement(By.xpath("//h2[text()='Video']"));
		Actions a=new Actions(driver);
		a.scrollToElement(target).click(target).perform();
		driver.findElement(By.xpath("(//button)[20]")).click();
		Thread.sleep(30000);
		driver.quit();

	}

}
