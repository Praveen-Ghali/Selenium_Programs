package methods_for_webElements;
//WAS to print X and Y axis of login button present in facebook:
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AxisOfLoginButton {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		int X = driver.findElement(By.name("login")).getLocation().getX();
		int Y = driver.findElement(By.name("login")).getLocation().getY();
		System.out.println("X-Axis: "+X);
		System.out.println("Y-Axis: "+Y);
		driver.quit();
	}
	

}
