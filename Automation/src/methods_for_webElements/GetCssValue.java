package methods_for_webElements;
//WAS top print font size and font family of the Forgotten password link in facebook:
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValue {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String color = driver.findElement(By.name("login")).getCssValue("background-color");
		System.out.println(color);
		String size = driver.findElement(By.linkText("Forgotten password?")).getCssValue("font-size");
		String family = driver.findElement(By.linkText("Forgotten password?")).getCssValue("font-family");
		System.out.println(size);
		System.out.println(family);
		driver.quit();
	}

}
