package com.actitime.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Demoassertion2 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	@Test
	public void verrifyTitle() {
		WebDriver driver=new ChromeDriver();
		String eTitle= "Soogle";
				String aTitle = driver.getTitle();
				SoftAssert s=new SoftAssert();
				s.assertEquals(aTitle, eTitle);
				driver.close();
			s.assertAll();
			
	}
}
