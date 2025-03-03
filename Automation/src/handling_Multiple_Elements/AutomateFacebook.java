package handling_Multiple_Elements;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class AutomateFacebook {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter day");
		String d = sc.nextLine();
		System.out.println("Enter month");
		String m = sc.nextLine();
		System.out.println("Enter year");
		String y=sc.nextLine();
		ChromeOptions options = new ChromeOptions();// We disabling Notification Pop-Up i.e Allow and Block
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Praveen");
		driver.findElement(By.name("lastname")).sendKeys("Ghali");
		driver.findElement(By.xpath("//input[@id='sex' and @value='2']")).click();
		WebElement dayListbox = driver.findElement(By.id("day"));
		Select day = new Select(dayListbox);
		List<WebElement> alldays = day.getOptions();
		int nday = alldays.size();
		for (int i = 0; i < nday; i++) {
			day.selectByIndex(i);
			String dayText = alldays.get(i).getText();
			if (dayText.equals(d)) {
				break;
			}
		}
		WebElement monthListbox = driver.findElement(By.id("month"));
		Select month = new Select(monthListbox);
		List<WebElement> allmonth = month.getOptions();
		int nmonth = allmonth.size();
		for (int i = 1; i < nmonth; i++) {
			month.selectByIndex(i);
			String monthText = allmonth.get(i).getText();
			if (monthText.equals(m)) {
				break;
			}
		}

		WebElement yearListbox = driver.findElement(By.id("year"));
		Select year = new Select(yearListbox);
		List<WebElement> allYear = year.getOptions();
		int nyear = allYear.size();
		for (int i = 0; i < nyear; i++) {
			year.selectByIndex(i);
			String yearText = allYear.get(i).getText();
			if (yearText.equals(y)) {
				break;
			}
		}

		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("praveenghali9@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Sankh@123");
		driver.findElement(By.name("websubmit")).click();
	}

}
