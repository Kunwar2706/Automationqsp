package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CustomerModule4 {
	@BeforeClass
	public void openBrowser() {
		Reporter.log("openBrowser");
	}
	@AfterClass
	public void closebrowser() {
		Reporter.log("closeBrowser");
	}
	@BeforeMethod
	public void login() {
		Reporter.log("login",true);
	}
	@AfterMethod
	public void logout() {
		Reporter.log("logout",true);
	}
	@Test(priority=1,invocationCount=2)
	public void editCustomer() {

	}
	@Test

	public void regsterCustomer() {
		Reporter.log("registerCustomer",true);
	}
	@Test
	public void deleteCustomer() {
		Reporter.log("deleteCustomer",true);
	}
}

