package handlingPop_Ups;
//WAS to upload Resume in Naukari.com
import java.io.File;
import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Upload_Resume_in_Naukari {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.naukri.com/mnjuser/homepage");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='usernameField']")).sendKeys("praveenghali9@gmail.com");
		driver.findElement(By.xpath("//input[@id='passwordField']")).sendKeys("Sankh@123");
		driver.findElement(By.xpath("//button[@class='waves-effect waves-light btn-large btn-block btn-bold blue-btn textTransform']")).submit();
		driver.findElement(By.partialLinkText("Complete")).click();
		driver.findElement(By.xpath("//a[contains(text(),'missing details')]")).click();
		Thread.sleep(5000);
		File f=new File("./Data/Mr.Praveen.docx");
		String abPath = f.getAbsolutePath();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys(abPath);
		driver.navigate().back();
		driver.findElement(By.xpath("//i[text()='deleteOneTheme']")).click();
		driver.findElement(By.xpath("(//button[@class='btn-dark-ot'])[2]")).click();
		driver.findElement(By.xpath("//img[@class='nI-gNb-icon-img']")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
				
	}

}
