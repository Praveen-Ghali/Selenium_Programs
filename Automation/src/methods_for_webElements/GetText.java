package methods_for_webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		String text = driver.findElement(By.id("licenseLink")).getText();
		System.out.println(text);
		driver.quit();
	}

}
