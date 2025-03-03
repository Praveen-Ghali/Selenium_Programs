package handling_Multiple_Elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllAutosuggestions {

	public static void main(String[] args) throws InterruptedException {
		//OPEN THE CHROMEBROWSER:
		WebDriver driver = new ChromeDriver();
		//ENTER THE URL:
		driver.get("https://www.google.com/");
		//TYPE THE selenium:
		driver.findElement(By.id("APjFqb")).sendKeys("selenium");
		Thread.sleep(2000);
		//CAPTURE ALL AUTOSUGGESTIONS:
		List<WebElement> allSugg = driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
		Thread.sleep(5000);
		//PRINT THE ALL COUNT OF SUGGESTIONS:
		int count = allSugg.size();
		System.out.println(count);
		//PRINT THE TEXT OF ALL AUTOSUGGESTIONS:
		for (int i = 0; i < count; i++) {
			WebElement link = allSugg.get(i);
			String text = link.getText();
			System.out.println(text);
		}
		//SELECT ON FIRST AUTOSUGGESTION:
		allSugg.get(0).click();
		//driver.quit();
		
		
	}

}
