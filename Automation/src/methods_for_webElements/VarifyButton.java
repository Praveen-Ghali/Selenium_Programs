package methods_for_webElements;
//WAS login button present in facebook is enabled or not:
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VarifyButton {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		boolean b = driver.findElement(By.name("login")).isEnabled();

		if (b == true) {
			System.out.println("Login button is Enabled and pass");

		} else {
			System.out.println("Login button is not Enabled and fail");
		}
	}

}
