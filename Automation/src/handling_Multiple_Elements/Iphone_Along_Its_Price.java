package handling_Multiple_Elements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iphone_Along_Its_Price {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone");
		List<WebElement> allLinks = driver.findElements(By.xpath("//a[@class='oleBil']/div[2]"));
		//List<WebElement> allLinks = driver.findElements(By.xpath("//a[@class='oleBil']/div[contains(text(),'iphone')]"));
		int count = allLinks.size();
		System.out.println(count);
		for (int i = 0; i < count; i++) {
			String text = allLinks.get(i).getText();
			System.out.println(text);
		}
		System.out.println("-----------------------------------------");
		allLinks.get(1).click();
		
		/*String product = driver.findElement(By.xpath("//div[@class='KzDlHZ']")).getText();
		String price = driver.findElement(By.xpath("//div[@class='yKfJKb row']/div[2]/div[1]/div[1]/div[1]")).getText();
		System.out.println(product+"===>"+price);*/
		
		List<WebElement> allProduct = driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
		List<WebElement> allPrice = driver.findElements(By.xpath("//div[@class='yKfJKb row']/div[2]/div[1]/div[1]/div[1]"));
		int count1 = allProduct.size();
		System.out.println("Total number of iphone 16= "+count1);
		System.out.println("------------------------------------------");
		for (int i = 0; i < count1; i++) {
			String product = allProduct.get(i).getText();
			String price = allPrice.get(i).getText();
			System.out.println("PRODUCT NAME:"+product+"===>"+"PRODUCT PRICE:"+price);
		}
		driver.quit();
	}

}
