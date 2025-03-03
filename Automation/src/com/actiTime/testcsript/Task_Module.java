package com.actiTime.testcsript;


import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actiTime.generic.BaseClass;
import com.actiTime.generic.FileLibrary;

@Listeners(com.actiTime.generic.ListenerImplementation.class)
public class Task_Module extends BaseClass{
	@Test(groups = "Smoke test")
	public void createTask() throws EncryptedDocumentException, IOException  {
		Reporter.log("create task",true);
		FileLibrary f=new FileLibrary();
		String custName = f.getCreateTaskExceldata("CreateCustomer", 1, 3);
		String description = f.getCreateTaskExceldata("CreateCustomer", 1, 4);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[@class='content tasks']")).click();
		driver.findElement(By.xpath("//div[text()='Add New']")).click();
		driver.findElement(By.xpath("//div[text()='+ New Customer']")).click();
		driver.findElement(By.id("customerLightBox_nameField")).sendKeys(custName);
		//Assert.fail();
		driver.findElement(By.id("customerLightBox_descriptionField")).sendKeys(description);
		driver.findElement(By.className("x-btn-text")).click();
		driver.findElement(By.linkText("Our Company")).click();
		driver.findElement(By.xpath("//span[text()='Create Customer']")).click();
		driver.navigate().refresh();
		String text = driver.findElement(By.xpath("//div[@class='navigationLinks']/..//a[@class='customer ellipsis']")).getText();
		System.out.println(text);
		System.out.println("customer created successfully");
		
	}
	
	/*@Test(groups = "Regression test")
	public void modifyTask() {
		Reporter.log("modify task",true);
		//Assert.fail();
	}
	
	@Test(groups = "Regression test")
	public void deleteTask() {
		Reporter.log("delete task",true);
	}*/
	
}

