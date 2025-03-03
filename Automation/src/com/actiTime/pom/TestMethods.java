package com.actiTime.pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


import page_object_module.HomePage;
import page_object_module.LoginPage;

public class TestMethods {
	WebDriver driver;
	@Test
	public void validLogin() throws InterruptedException {
	//public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://localhost/login.do");
		LoginPage l=new LoginPage(driver);
		l.setLogin("admin1", "manager1");
		Thread.sleep(3000);
		l.setLogin("admin", "manager");
		Thread.sleep(3000);
		HomePage h=new HomePage(driver);
		h.setLogout();
		Thread.sleep(3000);
		driver.close();
		
	}
}
