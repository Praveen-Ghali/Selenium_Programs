package methods_for_webElements;
//WAS to check gender radio button aligned in facebook create account page:
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VarifyAlignmentForRadioButton {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		int Y1 = driver.findElement(By.xpath("(//input[@type='radio'])[1]")).getLocation().getY();
		int Y2 = driver.findElement(By.xpath("(//input[@type='radio'])[2]")).getLocation().getY();
		int Y3 = driver.findElement(By.xpath("(//input[@type='radio'])[3]")).getLocation().getY();
		System.out.println(Y1);
		System.out.println(Y2);
		System.out.println(Y3);
		if (Y1==Y2 && Y2==Y3) {
			System.out.println("Gender radio buttons aligned properly and pass");
			
		}
		else {
			System.out.println("Gender radio button not aligned properly and fail");
			
		}
	}

}
