package handlingPop_Ups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopUp {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		//driver.quit();
		System.out.println("Pop-up pass");
		
	}

}
//In Authentication Pop-Up we can handle by passing UN and PWD along with url inside the get() method:
//In the above example admin after https request is UN and admin is the PWD: