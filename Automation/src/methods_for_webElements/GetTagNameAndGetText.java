package methods_for_webElements;
//WAS to print tagname for view license link and attribute value for onclick attribute name in actiTIME:
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTagNameAndGetText {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		String tagname = driver.findElement(By.linkText("View License")).getTagName();
		System.out.println("Tag name for view Licence: "+tagname);
		@Nullable
		String value = driver.findElement(By.xpath("//a[@onclick='openLicensePopup();']")).getAttribute("onclick");
		System.out.println(value);
	}

}
