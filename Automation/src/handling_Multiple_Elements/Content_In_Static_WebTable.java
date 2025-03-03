package handling_Multiple_Elements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Content_In_Static_WebTable {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.get("file:///C:/Users/Praveen%20M%20Ghali/OneDrive/Desktop/Demo.html");
		List<WebElement> alltexts = driver.findElements(By.xpath("//tr/td[1]"));
		List<WebElement> allprice = driver.findElements(By.xpath("//tr/td[2]"));
		int count = alltexts.size();
		System.out.println(count);
		for (int i = 0; i < count; i++) {
			String text = alltexts.get(i).getText();
			String price = allprice.get(i).getText();
			System.out.println(text+": "+price);
		}
		driver.quit();
	}

}
