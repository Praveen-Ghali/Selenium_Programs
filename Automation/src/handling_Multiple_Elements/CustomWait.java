package handling_Multiple_Elements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomWait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://localhost/login.do");

		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();

		int i = 1;
		while (i <= 20) {
			try {
				driver.findElement(By.xpath("//a[@id='logoutLink']")).click();
			} catch (NoSuchElementException e) {
				i++;
			}
		}
		System.out.println(i);// Here controler checking the 21 times for logout link is present in the the
								// webpage or not before to click on logout:
		driver.quit();

	}

}
