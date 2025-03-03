package methods_for_webElements;
//WAS to print status of the checkbox:
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VarifyCheckbox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		Thread.sleep(2000);
		driver.findElement(By.id("keepLoggedInCheckBox")).click();
		Thread.sleep(2000);
		boolean checkbox = driver.findElement(By.id("keepLoggedInCheckBox")).isSelected();
		Thread.sleep(2000);
		if (checkbox==true) {
			System.out.println("Checkbox is selected and pass");
		}
		else {
			System.out.println("Checkbox is not selected and fail");
		}
		driver.quit();
	}

}
