package methods_for_webElements;
import java.time.Duration;


//WAS to automate actiTIME to login: UN:admin PWD:manager
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SendKeys {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("http://localhost/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		//Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Logout")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Logout")));
		wait.until(ExpectedConditions.titleContains("Enter"));
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.linkText("Logout")).click();
		driver.quit();
	}
 
}
