package methods_for_webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRect {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		int h1 = driver.findElement(By.id("username")).getRect().getHeight();
		int w1 = driver.findElement(By.id("username")).getRect().getWidth();
		int h2 = driver.findElement(By.name("pwd")).getRect().getHeight();
		int w2 = driver.findElement(By.name("pwd")).getRect().getWidth();
		System.out.println(h1);
		System.out.println(h2);
		System.out.println(w1);
		System.out.println(w2);
		
	}

}
