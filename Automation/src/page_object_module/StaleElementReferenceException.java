package page_object_module;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementReferenceException {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://localhost/login.do");
		LoginPage l=new LoginPage(driver);
		l.setLogin("admin1", "manager1");
		Thread.sleep(3000);
		l.setLogin("admin", "manager");
		driver.quit();

	}

}
