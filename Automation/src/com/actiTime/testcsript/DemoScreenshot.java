package com.actiTime.testcsript;
//WAS to take Screenshot from bbc.com webpage after scrolling it by 600px for twice:

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class DemoScreenshot {
	@Test
	public void screenShot() throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bbc.com/");
		driver.manage().window().maximize();
		
		//We need to do Typecasting because getScreenshotAs() method is present in TakeScreenshot interface
		TakesScreenshot t=(TakesScreenshot) driver;
		File src1 = t.getScreenshotAs(OutputType.FILE);
		//We need to create object for File class beacause it is non static class
		//File() constructor having the parameter as a file path here "Screenshot" is the folder and "ss.png" is file name for screenshot
		File dest1 = new File("./Screenshot/ss1.png");
		//copyFile is the static method present inside FileUtils class so it takes parameter as src and dest
		//src: is the screenshot of the image 
		//dest: is the where we wants to store the src
		FileUtils.copyFile(src1, dest1);
		//driver.quit();
		RemoteWebDriver r=(RemoteWebDriver) driver;		
		r.executeScript("window.scrollTo(0,600)");
		File src2 = t.getScreenshotAs(OutputType.FILE);
		File dest2 = new File("./Screenshot/ss2.png");
		FileUtils.copyFile(src2, dest2);
		
		r.executeScript("window.scrollTo(0,600)");
		File src3 = t.getScreenshotAs(OutputType.FILE);
		File dest3 = new File("./Screenshot/ss3.png");
		FileUtils.copyFile(src3, dest3);
	}
}
