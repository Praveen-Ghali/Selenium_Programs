package handling_Child_Pop_Ups;
//1.Open the browser

//2.Enter url:actiTIME
//3.Login UN:admin PWD:manager
//4.click on Help dropdown and select "About Your actiTIME"
//5.Click on "Read license agreement" link
//Print all headings present in the License agreement tab
//Close the parent tab first then close child tab.

import java.time.Duration;
import java.util.List;
import java.util.Set;

import javax.swing.border.TitledBorder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTIME_LicenseAgreement_PopUp_Handling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://localhost/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		driver.findElement(By.xpath("//div[@class='popup_menu_button popup_menu_button_support']")).click();
		driver.findElement(By.linkText("About your actiTIME")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Read License Agreement")).click();
		//driver.close();
		Set<String> allWh = driver.getWindowHandles();

		for (String wh : allWh) {
			driver.switchTo().window(wh);
			String title = driver.getTitle();
			System.out.println(title);
			if (title.contains("License Agreement")) {
				List<WebElement> headings = driver.findElements(By.xpath("(//div[@class='licenseText no_restrictions_para']/h2)"));
				int count = headings.size();
				System.out.println("COUNT of Headings " + count);
				for (WebElement h : headings) {
					System.out.println(h.getText());
				}

			}
				Thread.sleep(10000);
				if (title.contains( "Enter Time-Track")) {
				driver.switchTo().window(wh);
				driver.close();
			}
		}
		Thread.sleep(10000);
		driver.quit();

	}
}
