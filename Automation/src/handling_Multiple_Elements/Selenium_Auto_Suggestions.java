package handling_Multiple_Elements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Auto_Suggestions {

	public static void main(String[] args) {
		//OPEN THE CHROMEBROWSER:
				WebDriver driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
				//ENTER THE URL:
				driver.get("https://www.google.com/");
				//TYPE THE selenium:
				driver.findElement(By.id("APjFqb")).sendKeys("selenium");
				//CAPTURE ALL AUTOSUGGESTIONS:
				List<WebElement> allSugg = driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
				//PRINT THE ALL COUNT OF SUGGESTIONS:
				int count = allSugg.size();
				System.out.println("Count of Selenium Auto-suggestions:"+count);
				System.out.println("_________________________________________");
				//PRINT THE TEXT OF ALL AUTOSUGGESTIONS:
				for (int i = 0; i < count; i++) {
					WebElement link = allSugg.get(i);
					String text = link.getText(); 
					System.out.println(text);
				}
				//SELECT ON FIRST AUTOSUGGESTION:
				allSugg.get(0).click();
				driver.quit();
				
	}

}
