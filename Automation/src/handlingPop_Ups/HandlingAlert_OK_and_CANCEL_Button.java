package handlingPop_Ups;
//Open the browser and enter url:https://demo.automationtesting.in/Alerts.html
//Click on alert with OK/CANCEL 
//Click on confirmbox button
//Click on the cancel button of the Pop-up
//Varify the text "You Pressed Cancel" is displayed or not
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingAlert_OK_and_CANCEL_Button {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert a = driver.switchTo().alert();
		String text = a.getText();
		Thread.sleep(2000);
		a.dismiss();
		System.out.println(text);
		
		boolean message = driver.findElement(By.xpath("//p[@id='demo']")).isDisplayed();
		if (message==true) {
			System.out.println("'You Pressed Cancel'text is displayed and pass");
		}
		else {
			System.out.println("Not displayed and fail");
		}
		driver.quit();
	}

}
