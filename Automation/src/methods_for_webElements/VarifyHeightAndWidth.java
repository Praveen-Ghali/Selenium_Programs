package methods_for_webElements;
//WAS to varify the height and width of UN and PWD textbox equal or not in actiTIME:
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VarifyHeightAndWidth {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		int h1 = driver.findElement(By.id("username")).getSize().getHeight();
		int w1 = driver.findElement(By.id("username")).getSize().getWidth();
		int h2 = driver.findElement(By.name("pwd")).getSize().getHeight();
		int w2 = driver.findElement(By.name("pwd")).getSize().getWidth();
		if (h1==h2 && w1==w2) {
			System.out.println("UN and PWD both textfields are same width and height");
		}
		else {
			System.out.println("UN and PWD both textfields are not same width and height");
		}
		System.out.println(h1);
		System.out.println(h2);
		System.out.println(w1);
		System.out.println(w2);
		driver.quit();
	}
	

}
