package HandlingListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectListBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Praveen%20M%20Ghali/OneDrive/Desktop/HTML/Listbox.html");
		//driver.findElement(By.id("mtr")).click();
		WebElement mtrListbox = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrListbox);
		s.selectByIndex(1);
		s.selectByValue("mi");
		s.selectByVisibleText("Button Idly");
		Thread.sleep(1000);
		s.deselectByIndex(3);
		s.deselectByValue("mi");
		s.deselectByVisibleText("Tatte Idly");
		driver.quit();	
	}

}
