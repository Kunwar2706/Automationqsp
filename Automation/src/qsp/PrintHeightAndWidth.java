package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintHeightAndWidth {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		int h1 = driver.findElement(By.id("username")).getSize().getHeight();
		int w1 = driver.findElement(By.id("username")).getSize().getWidth();

		System.out.println("height user text box  "+h1);
		System.out.println("width user text box  "+w1);
		System.out.println("----------------");
		int h2 = driver.findElement(By.name("pwd")).getSize().getHeight();
		int w2 = driver.findElement(By.name("pwd")).getSize().getWidth();
		System.out.println("height of password textbox    "+h2);
		System.out.println("width of password textbox    "+w2);
		System.out.println("--------------------------------");
		if(h1==h2 && w1==w2)
		{
			System.out.println("test is pass");

		}
		else
		{
			System.out.println("test is failed");
		}
		driver.close();
	}
	  
	}



