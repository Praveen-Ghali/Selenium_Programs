package handlingPop_Ups;
//Ex:-Hidden division and Calender Pop-Up
/*WAS to automate following scenerios
url:https://www.careinsurance.com/rhicl/proposalcp/renew/index-care
Policy no:123 DOB:14/07/1997  contact no:9845098450
click on "Lets Renew" button
varify the text "Please enter valid policy No." displayed or not*/

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;      
import org.openqa.selenium.support.ui.Select;

public class Care_Insurence {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.manage().window().maximize();
		driver.findElement(By.id("policynumber")).sendKeys("123");
		driver.findElement(By.xpath("//input[@id='dob']")).click();
		WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select s1 = new Select(month);
		s1.selectByIndex(6);
		WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select s2 = new Select(year);
		s2.selectByValue("1997");
		driver.findElement(By.xpath("(//td[@class=' '])[10]")).click();
		driver.findElement(By.xpath("//input[@class='form-control ']")).sendKeys("9845098450");
		//String captcha = driver.findElement(By.xpath("//img[@class='captcha-img']")).getText();
		//System.out.println(captcha);
		
		driver.findElement(By.xpath("//button[@id='renew_policy_submit']")).click();
		String text = driver.findElement(By.xpath("//span[@id='policynumberError']")).getText();
		// System.out.println(text);
		boolean text1 = driver.findElement(By.xpath("//span[@id='policynumberError']")).isDisplayed();
		if (text1 = true) {
			System.out.println(text + " is displayed");
		} else {
			System.out.println("Not displayed");
		}
		driver.quit();
	}

}
