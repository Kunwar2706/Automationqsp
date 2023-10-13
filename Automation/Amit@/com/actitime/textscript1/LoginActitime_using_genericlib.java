package com.actitime.textscript1;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.actitime.generic1.filelibpropertyfile;

public class LoginActitime_using_genericlib {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws IOException {
		 filelibpropertyfile f=new  filelibpropertyfile();
		String url = f.getProperty("url");
		String un = f.getProperty("username");
		String pw= f.getProperty("password");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(url);
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pw);;
		driver.findElement(By.xpath("//div[text()='Login'])")).click();
		driver.close();
		 
	}

}
