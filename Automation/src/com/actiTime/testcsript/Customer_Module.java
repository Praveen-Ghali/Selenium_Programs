package com.actiTime.testcsript;


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actiTime.generic.BaseClass;

public class Customer_Module extends BaseClass {
	
	@Test(groups = "Smoke test")
	public void createCustomer() {
		Reporter.log("Create customer", true);
		//Assert.fail();
	}

	@Test(groups = "Regression test")
	public void editCustomer() {
		Reporter.log("Edit customer", true);
	}

	@Test(groups = "Regression test")
	public void deleteCustomer() {
		Reporter.log("delete customer", true);
		
	}
}
