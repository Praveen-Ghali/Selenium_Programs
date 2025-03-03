package HandlingListBox;
//WAS to print duplicate elements present in the listBOX:

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintDuplicateOnly {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Praveen%20M%20Ghali/OneDrive/Desktop/Listbox.html");
		WebElement mtrListbox = driver.findElement(By.id("mtr"));
		Select s = new Select(mtrListbox);
		List<WebElement> allOpt = s.getOptions();
		int count = allOpt.size();
		
		ArrayList<String> a = new ArrayList<String>();
		for (int i = 0; i < count; i++) {
			String text = allOpt.get(i).getText();
			a.add(text);
		}
		// Collections.sort(a);
		int count1=0;
		System.out.println("Duplicate elements are listed below");
		for (int i = 0; i < count; i++) {
			int num = 0;
			for (int j = i + 1; j < count; j++) {
				if (a.get(i).equals(a.get(j))) {
					num++;
					break;
				}
			}
			if (num == 1) {
				System.out.println(a.get(i));
				count1++;
			}
		}
		System.out.println("Total No of elements:"+ count);
		System.out.println("No of duplicates:"+count1);
		driver.quit();    
	}
}
