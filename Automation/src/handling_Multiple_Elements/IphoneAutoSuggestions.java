package handling_Multiple_Elements;
//To print all Autosuggestion for iphone:
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IphoneAutoSuggestions {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone");
		//List<WebElement> allLinks = driver.findElements(By.xpath("//a[@class='oleBil']/div[2]"));
		List<WebElement> allLinks = driver.findElements(By.xpath("//a[@class='oleBil']/../../div/a/div[2]"));
		//List<WebElement> allLinks = driver.findElements(By.xpath("//a[@class='oleBil']/div[contains(text(),'iphone')]"));
		int count = allLinks.size();
		System.out.println(count);
		for (int i = 0; i < count; i++) {
			String text = allLinks.get(i).getText();
			System.out.println(text);
		}
		allLinks.get(count-1).click();
		driver.quit();
	}

}
  