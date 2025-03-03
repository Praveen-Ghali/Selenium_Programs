package com.actiTime.generic;


import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import com.actiTime.pom.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;


public class BaseClass {
	
	public static WebDriver driver;
	@BeforeTest
	public void openBrowser() {
		Reporter.log("Open browser",true);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@AfterTest
	public void closeBrowser() {
		Reporter.log("close Browser",true);
		driver.quit(); 
	}
	@BeforeMethod
	public void login() throws IOException {
		Reporter.log("login",true);
		/*FileInputStream fis=new FileInputStream("./Data/commondata.property");
		Properties p=new Properties();
		p.load(fis);
		String url = p.getProperty("url");
		String un = p.getProperty("username");
		String pwd = p.getProperty("password");*/
		
		FileLibrary f=new FileLibrary();
		String url = f.getPropertyData("url");
		String un = f.getPropertyData("username");
		String pwd = f.getPropertyData("password");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		/*driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();*/
		LoginPage l=new LoginPage(driver);
		l.setLogin(un, pwd);
	}
	@AfterMethod
	public void logout() {
		Reporter.log("logout",true);
		//driver.findElement(By.xpath("//a[@id='logoutLink']")).click();
		HomePage hm=new HomePage(driver);
		hm.setLogout();
		//Assert.fail();
	}
	
	
}
