package handling_Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Nested_iFrame {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/frames/nested?sublist=1");
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));
		String email = driver.findElement(By.xpath("(//p[@class='para'])[1]")).getText();
		System.out.println(email);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
		driver.switchTo().parentFrame();
		String password = driver.findElement(By.xpath("(//p[@class='para'])[2]")).getText();
		System.out.println(password);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		driver.switchTo().parentFrame();
		String confirmpassword = driver.findElement(By.xpath("(//p[@class='para'])[3]")).getText();
		System.out.println(confirmpassword);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@id='confirm-password']")).sendKeys(confirmpassword);
		driver.findElement(By.xpath("//button[@id='submitButton']")).click();
		driver.switchTo().defaultContent();
		//driver.switchTo().parentFrame();
		String login = driver.findElement(By.xpath("//div[text()='Sign up successful!']")).getText();
		System.out.println(login);
		if (login.contains("Sign up")) {
			System.out.println("Sign up successfully and Pass");
		}
		else {
			System.out.println("Sign up not successfully fail");
		}
		driver.quit();
	}

}
