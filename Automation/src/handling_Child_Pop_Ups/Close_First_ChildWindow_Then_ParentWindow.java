package handling_Child_Pop_Ups;
//WAS to close first child window then Parent window Present in the actiTIME after clicking 
//actiTIME Inc(without use for loop use iterator() method)

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close_First_ChildWindow_Then_ParentWindow {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://localhost/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.linkText("actiTIME Inc.")).click();
	 	Set<String> allWh = driver.getWindowHandles();
		/*ArrayList<String> a=new ArrayList<>();
		ListIterator i= a.listIterator();
		while (i.hasNext()) {
			Object object = (Object) i.next();
			i.add(object);
			System.out.println(a);
		}*/
		
		for (String tab : allWh) {
			driver.switchTo().window(tab);
			String title = driver.getTitle();
			//System.out.println(title);
			if (!(title.equals("actiTIME - Login"))) {
				Thread.sleep(5000);
				driver.close();
			}
		}
		driver.close();
		
	}
}
