package handlingPop_Ups;
//
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Alert__With_Textbox {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		driver.switchTo().alert().sendKeys("Praveen");
		//String text = driver.switchTo().alert().getText();
	 	//System.out.println(text);
		driver.switchTo().alert().accept();
		String text1 = driver.findElement(By.xpath("//p[@id='demo1']")).getText();
		System.out.println(text1);
		//driver.quit();
	}

}
