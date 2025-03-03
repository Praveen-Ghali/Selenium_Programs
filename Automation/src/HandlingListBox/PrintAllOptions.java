package HandlingListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllOptions {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Praveen%20M%20Ghali/OneDrive/Desktop/Listbox.html");
		WebElement slvListbox = driver.findElement(By.id("slv"));
		Select s=new Select(slvListbox);
	
		List<WebElement> printAllOpt= s.getOptions();
		for (int i = 0; i <printAllOpt.size(); i++) {
			String text = printAllOpt.get(i).getText();
			System.out.println(text);
		}
		driver.quit();
	}

}
