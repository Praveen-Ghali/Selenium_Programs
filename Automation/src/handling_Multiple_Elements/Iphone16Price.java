package handling_Multiple_Elements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iphone16Price {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone 16");
		driver.findElement(By.xpath("//button[@title='Search for Products, Brands and More']")).submit();
		List<WebElement> allProduct = driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
		//List<WebElement> allProduct = driver.findElements(By.xpath("//div[contains(text(),'iPhone 16')]"));
		List<WebElement> allPrice = driver.findElements(By.xpath("//div[@class='yKfJKb row']/div[2]/div[1]/div[1]/div[1]"));
		int count1 = allProduct.size();
		System.out.println("Total number of iphone 16= "+count1);
		System.out.println("------------------------------------------");
		for (int i = 0; i < count1; i++) {
			String product = allProduct.get(i).getText();
			String price = allPrice.get(i).getText();
			System.out.println((i+1)+")PRODUCT NAME:"+product+"===>"+"PRODUCT PRICE:"+price);
		}
		driver.quit();
	} 
}
	