package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadedTimeOutCls {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);
		try {
		driver.get("https://demo.actitime.com/login.do");
		System.out.println("page is loaded within a 5 sec ");
		}
		catch(Exception e)
		{
			System.out.println("page is  not loaded within a 5 sec ");
		}
		driver.close();
	}
	}
