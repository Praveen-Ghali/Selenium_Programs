package relativeXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_By_Traversing {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Praveen%20M%20Ghali/OneDrive/Desktop/Demo.html");
		//Forward traversing:Navigating from parent element to child element
		driver.findElement(By.xpath("//table/tbody/tr[5]/td[1]"));
		driver.findElement(By.xpath("//td[text()='Manual Testing']"));
		driver.findElement(By.xpath("//td[contains(text(),'Manual ')]"));
		
		//Backward traversing:Navigating from child element to parent element
		driver.findElement(By.xpath("//td[contains(text(),'Manual ')]/../../.."));//from text value to table tag
	}

}
