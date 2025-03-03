package relativeXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_By_Text_Function {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Praveen%20M%20Ghali/OneDrive/Desktop/Demo.html");
		driver.findElement(By.xpath("//a[text()='Qspider']")).click();
		driver.findElement(By.xpath("//a[text()='Google']")).click();
		driver.quit();
	}

}
//SYNTAX: //tag[text()='value'] or //tag[.='value']
//Def:When we dont have attribute and we have only text then we use Xpath by Text function: