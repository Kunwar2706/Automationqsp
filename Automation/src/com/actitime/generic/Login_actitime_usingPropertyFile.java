package com.actitime.generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login_actitime_usingPropertyFile {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	

@AfterClass
public void closeBrowser() {
	Reporter.log("closeBrowser",true);
}
@BeforeMethod
public void login() throws IOException, InterruptedException 
{
	FileLib f=new FileLib();
	String url = f.getpropertyData("url");
	String un= f.getpropertyData("username");
	String pw = f.getpropertyData("password");
	System.out.println(url);
	System.out.println(un);
	System.out.println(pw);
	Reporter.log("Login process started", true);
	 WebDriver driver=new ChromeDriver();
	//driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	//Reporter.log("openBroweser",true);
	//Reporter.log("login",true);
	 Thread.sleep(5000);
	driver.get(url);
	
	driver.findElement(By.id("username")).sendKeys(un);
	driver.findElement(By.name("pwd")).sendKeys(pw);
	driver.findElement(By.id("loginButton")).click();
	Thread.sleep(5000);
	driver.findElement(By.id("logoutLink"));
	
}
@Test
public void Run() {
	
}

}
