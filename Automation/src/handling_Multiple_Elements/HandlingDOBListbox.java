package handling_Multiple_Elements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingDOBListbox {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();//We disabling Notification Pop-Up i.e Allow and Block
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Praveen");
		driver.findElement(By.name("lastname")).sendKeys("Ghali");
		driver.findElement(By.xpath("//input[@id='sex' and @value='2']")).click();
		WebElement dayListbox = driver.findElement(By.id("day"));
		Select day=new Select(dayListbox);
		day.selectByIndex(13);
		WebElement monthListbox = driver.findElement(By.id("month"));
		Select month=new Select(monthListbox);
		month.selectByValue("7");
		WebElement yearListbox = driver.findElement(By.id("year"));
		Select year=new Select(yearListbox);
		year.selectByVisibleText("1997");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("praveenghali9@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Sankh@123");
		driver.findElement(By.name("websubmit")).click();
		//After login Home page displaying Notification Pop-Up: We handled it on the above statement
		driver.findElement(By.xpath("(//div[@role='navigation'])[2]/span")).click();
		driver.findElement(By.xpath("//span[text()='Log Out']")).click();
		driver.quit();
		System.out.println("Logout successfully");
		
	}

}
