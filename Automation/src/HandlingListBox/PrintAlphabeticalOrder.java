package HandlingListBox;
//WAS to print elements in alphabetical order:
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAlphabeticalOrder {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Praveen%20M%20Ghali/OneDrive/Desktop/Listbox.html");
		WebElement mtrListbox = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrListbox);
		List<WebElement> allOpt = s.getOptions();
		int count = allOpt.size();
		ArrayList<String> a=new ArrayList<String>();
		for (int i = 0; i < count; i++) {
			String text = allOpt.get(i).getText();
			a.add(text);
		}
		Collections.sort(a);
		for (String foodItems : a) {
			System.out.println(foodItems);
		}
		driver.quit();
	}

}
 