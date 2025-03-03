package handling_Child_Pop_Ups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaAutoSugg {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.dummysoftware.com/popupdummy_testpage.html");
		Set<String> listAllWh = driver.getWindowHandles();	
		for (String address : listAllWh) {
			driver.switchTo().window(address);
			String title = driver.getTitle();
			//System.out.println(text);
			if ((title.equals("Screen 3"))) {
				String text1 = driver.findElement(By.xpath("//font[contains(text(),'This is the Anti-Popup-Blocker screen.')]")).getText();
				//System.out.println(text1);
				if (text1.contains("Anti-Popup-Blocker screen")) {
					System.out.println(title);
				}
			}
			driver.close();
	}

}
}
