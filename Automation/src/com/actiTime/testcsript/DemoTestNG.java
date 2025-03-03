package com.actiTime.testcsript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTestNG {
	
	@Test
	public void demo() {
		System.out.println("Hello");//Print only on console:
		Reporter.log("Welcome to Testing",true);//Prints on report and console:
		Reporter.log("Selenium",false);//Prints only on report not in console:
		Reporter.log("Good evening");//Prints only on report:
	}
}
