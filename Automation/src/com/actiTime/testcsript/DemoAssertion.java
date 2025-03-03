package com.actiTime.testcsript;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemoAssertion {

	@Test
	public void varifyTitle() {
		System.out.println("Enter title name");
		Scanner sc = new Scanner(System.in);
		String aTitle = sc.nextLine();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String etitle = driver.getTitle();
		SoftAssert s = new SoftAssert();
		// Assert.assertEquals(aTitle, etitle);
		s.assertEquals(aTitle, etitle);// comparison
		Reporter.log("Comparison matched", true);
		driver.quit();
		s.assertAll();// This method helps to continue the execution even after the failure of the
						// comparison:
		Reporter.log("Hi", true);// Any statement after assertAll() method won't be executed if comparison fail:
	}
}
