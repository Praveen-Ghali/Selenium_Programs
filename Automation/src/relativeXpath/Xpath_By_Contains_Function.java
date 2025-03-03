package relativeXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_By_Contains_Function {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		WebElement e = driver.findElement(By.xpath("//nobr[contains(text(),'actiTIME 2017.4')]"));
		e.click();

	}

}
//Syntax:tag[contains(text(),'value')]
//Def:when text value is changing partially then we can use Xpath by text function
