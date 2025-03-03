package handling_Multiple_Elements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BBC_More_News {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.get("https://www.bbc.com/");
		 //String allNews = driver.findElement(By.xpath("//h2[@data-testid='ohio-title']/../../../../../../div[2]/div//h2")).getText();
		//int count = allNews.size();
		//System.out.println(allNews);
		List<WebElement> allnews = driver.findElements(By.xpath("//h2[@data-testid='ohio-title']/../../../../../../div[2]/div//h2"));
		int count = allnews.size();
		System.out.println("Number of Breaking news :"+count);
		System.out.println("---------------------------");
		for (int i = 0; i < count; i++) {
			String breakingnews = allnews.get(i).getText();
			System.out.println("NEWS-"+(i+1)+":"+ breakingnews);
		}
		//driver.quit();
		
	}

}
 