package com.actitime.generic;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Actitime_With_Generic {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws IOException {
    FileLib f=new FileLib();
     String url = f.getpropertyData("url");
     String un = f.getpropertyData("username");
     String pw = f.getpropertyData("password");
     WebDriver driver=new ChromeDriver();
     driver.get(url);
     driver.findElement(By.id("username")).sendKeys(un);
     driver.findElement(By.name("pwd")).sendKeys(pw);
     driver.findElement(By.id("loginButton")).click();
	}

}
