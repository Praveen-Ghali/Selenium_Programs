package dataDrivenTesting;
//WAS login to the actiTIME application to read UN and PWD from the Property file:
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPropertyFile {

	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream fis=new FileInputStream("./data/commondata.property");
		Properties p=new Properties();
		p.load(fis);
		String url = p.getProperty("url");
		String un = p.getProperty("username");
		String pwd=p.getProperty("password");
		System.out.println(url);
		System.out.println(un);
		System.out.println(pwd);
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys(un);
		Thread.sleep(3000);		
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		Thread.sleep(3000);	
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		Thread.sleep(3000);	
		driver.quit();
	}

}
