package HandlingListBox;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAllOptions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Praveen%20M%20Ghali/OneDrive/Desktop/Listbox.html");
		WebElement slvListbox = driver.findElement(By.id("slv"));
		Select s=new Select(slvListbox);
		List<WebElement> printAllOpt= s.getOptions();
		int count = printAllOpt.size();
		for (int i = 0; i < count; i++) {
			Thread.sleep(1000);
			s.selectByIndex(i);
		}
		for (int i = count-1; i>=0; i--) {
			Thread.sleep(1000);
			s.deselectByIndex(i);
		}
	}

}
