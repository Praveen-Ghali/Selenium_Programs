package relativeXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_By_Attribute {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Praveen%20M%20Ghali/OneDrive/Desktop/Demo.html");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("pmg@gmail.com");
		driver.findElement(By.xpath("//input[@type='text' and @placeholder='Password']")).sendKeys("praveen@123");
		driver.findElement(By.xpath("//input[@type='button' and @value='A']")).click();
	}

}
//SYNTAX:--> //tag[@AN='AV']
			//tag[@AN1='AV1' and @AN2='AV2']
			//tag[@AN1='AV1' or @AN2='AV2']
			//tag[not @AN='AV]