package handling_DisabledElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HandlingDisabledElements {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();//upcasted
		driver.get("file:///C:/Users/Praveen%20M%20Ghali/OneDrive/Desktop/Dis.html");
		driver.findElement(By.id("d1")).sendKeys("admin");
		RemoteWebDriver rm=(RemoteWebDriver) driver;//downcasted
		
		//All the below statements first type in Console to confirm code working proper or not  then write it into script
		rm.executeScript("document.getElementById('d2').value='manager'");//pass the value
		rm.executeScript("document.getElementById('d2').value=''");//Remove the value
		rm.executeScript("document.getElementById('d4').click()");//To click on the element
	}

}
