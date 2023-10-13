package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMulitipleElements {
	static {
		System.setProperty("webelement.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Me/Desktop/Demo.html");
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));	
		int count = allLinks.size();
		System.out.println(count);
		WebElement link= allLinks.get(0);
		String text = link.getText();// string text=allLinks.get(0).getText();
		System.out.println(text);
		driver.close();
	}
		}

