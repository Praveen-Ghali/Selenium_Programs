package HandlingListBox;
//WAS to print all the elements present in the MTR listbox witout duplicates:
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintNoDuplicates {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Praveen%20M%20Ghali/OneDrive/Desktop/HTML/Listbox.html");
		WebElement mtrListbox = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrListbox);
		List<WebElement> allOpt = s.getOptions();
		int count = allOpt.size();
		System.out.println(count);
		HashSet<String> h=new HashSet<String>();
		TreeSet<String> t=new TreeSet<String>();
		for (int i = 0; i < count; i++) {
			String text = allOpt.get(i).getText();
			h.add(text);
		}
		Iterator<String> i = h.iterator(); 
		while (i.hasNext()) {
			String string = (String) i.next();
			System.out.println(string);
			
		}
		/*for (String string : h) {
			System.out.println(string);
		}*/
		
		System.out.println("-----------------------------");
		System.out.println("Alphabetical order");
		System.out.println("-----------------------------");

		for (int i1 = 0; i1 < count; i1++) {
			String text = allOpt.get(i1).getText();
			t.add(text);
		}
		for (String string : t) {
			System.out.println(string);
			
		}
		driver.quit();

	}

}
