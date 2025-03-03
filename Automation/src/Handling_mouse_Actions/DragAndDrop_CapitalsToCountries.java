package Handling_mouse_Actions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop_CapitalsToCountries {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Actions a=new Actions(driver);
		WebElement src1 = driver.findElement(By.xpath("//div[@id='box1']"));
		WebElement dest1 = driver.findElement(By.xpath("//div[@id='box101']"));
		a.dragAndDrop(src1, dest1).perform();
		Thread.sleep(1000);
		WebElement src2 = driver.findElement(By.xpath("//div[@id='box2']"));
		WebElement dest2 = driver.findElement(By.xpath("//div[@id='box102']"));
		a.dragAndDrop(src2, dest2).perform();
		Thread.sleep(1000);
		WebElement src3 = driver.findElement(By.xpath("//div[@id='box3']"));
		WebElement dest3 = driver.findElement(By.xpath("//div[@id='box103']"));
		a.dragAndDrop(src3, dest3).perform();
		Thread.sleep(1000);
		WebElement src4 = driver.findElement(By.xpath("//div[@id='box4']"));
		WebElement dest4 = driver.findElement(By.xpath("//div[@id='box104']"));
		a.dragAndDrop(src4, dest4).perform();
		Thread.sleep(1000);
		WebElement src5 = driver.findElement(By.xpath("//div[@id='box5']"));
		WebElement dest5 = driver.findElement(By.xpath("//div[@id='box105']"));
		a.dragAndDrop(src5, dest5).perform();
		Thread.sleep(1000);
		WebElement src6 = driver.findElement(By.xpath("//div[@id='box6']"));
		WebElement dest6 = driver.findElement(By.xpath("//div[@id='box106']"));
		a.dragAndDrop(src6, dest6).perform();
		Thread.sleep(1000);
		WebElement src7 = driver.findElement(By.xpath("//div[@id='box7']"));
		WebElement dest7 = driver.findElement(By.xpath("//div[@id='box107']"));
		a.dragAndDrop(src7, dest7).perform();
		Thread.sleep(1000);
		driver.quit();
		
	}

}
