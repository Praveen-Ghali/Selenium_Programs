package HandlingListBox;

//WAS to search/print specific option present in the list:
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SearchSpecificOption {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Praveen%20M%20Ghali/OneDrive/Desktop/HTML/Listbox.html");
		WebElement mtrListbox = driver.findElement(By.id("mtr"));
		Select s = new Select(mtrListbox);
	
		List<WebElement> allOpt = s.getOptions();
		
		int count = allOpt.size();
		System.out.println(count);
		System.out.println("Enter the food item in the list");
		Scanner sc = new Scanner(System.in);
		String seachItem = sc.nextLine();
		int num = 0;
		for (int i = 0; i < count; i++) {
			String text = allOpt.get(i).getText();
			if (seachItem.equals(text)) {
				// System.out.println(text);
				num++;
				break;
			}
		}

		if (num == 1) {
			System.out.println(seachItem+" Food item is available");
		} else {
			System.out.println(seachItem+" Food item not available");
		}
		driver.quit();
	}

}
