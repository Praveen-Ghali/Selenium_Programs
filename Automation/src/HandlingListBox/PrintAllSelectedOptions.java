package HandlingListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllSelectedOptions {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Praveen%20M%20Ghali/OneDrive/Desktop/Listbox.html");
		WebElement slvListbox = driver.findElement(By.id("slv"));
		Select s=new Select(slvListbox);
		
		List<WebElement> allOpt = s.getAllSelectedOptions();
		int count = allOpt.size();
		System.out.println(count);
		for (int i = 0; i <count; i++) {
			for (int j = 0; j <=0; j++) {
				String text = allOpt.get(i).getText();
				System.out.println(text);
				
			}
			
		}
		driver.quit();
	}

}
