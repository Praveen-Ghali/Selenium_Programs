package handlingPop_Ups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automate_To_Play_Video_In_YouTube {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input[@name='search_query'])[1]")).sendKeys("Mayavi Kannada Song");
		driver.findElement(By.xpath("//button[@class='ytSearchboxComponentSearchButton']")).click();
		//driver.findElement(By.xpath("(//img[@class='yt-core-image yt-core-image--fill-parent-height yt-core-image--fill-parent-width yt-core-image--content-mode-scale-aspect-fill yt-core-image--loaded'])[1]")).click();
		//driver.findElement(By.id("video-title")).click();
		//driver.findElement(By.xpath("(//img[@class='yt-core-image yt-core-image--fill-parent-height yt-core-image--fill-parent-width yt-core-image--content-mode-scale-aspect-fill yt-core-image--loaded'])[3]")).click();
		driver.findElement(By.xpath("(//a[@id='thumbnail'])[4]")).click();
		
	}

}
