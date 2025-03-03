package relativeXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_By_Independent_Dependent_Element {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Praveen%20M%20Ghali/OneDrive/Desktop/Demo.html");
		driver.findElement(By.xpath("//td[text()='SQL']/../td[2]"));
	}

}

//Def:-->When value is changing completely then we use to handle it by using independent and dependent Xpath:
//To handle dynamic web table element here we write the xpath by using forward and backward traversing:
//Here we always starts from Independent element and and ends with dependent element:
//In the above example SQL is the independent element and data in the td[2] is the dependent element on SQL:
