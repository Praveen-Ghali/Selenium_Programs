package com.actiTime.testcsript;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actiTime.generic.BaseClass;
@Listeners(com.actiTime.generic.ListenerImplementation.class)
public class Project_Module extends BaseClass{
	@Test(groups = "Smoke test")
	public void createProject() {
		Reporter.log("createProject",true);
		//Assert.fail();
	}
	
	@Test(groups = "Regression test")
	public void modifyProject() {
		Reporter.log("modify project",true);
		//Assert.fail();
	}
	
	@Test(groups = "Regression test")
	public void deleteProject() {
		Reporter.log("delete project",true);
		
	}
}
