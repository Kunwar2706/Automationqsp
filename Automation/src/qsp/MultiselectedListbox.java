package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiselectedListbox {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Me/Desktop/Hotel.html");
		WebElement mtrListbox = driver.findElement(By.id("mtr"));
		Thread.sleep(3000);
		Select s=new Select(mtrListbox );
		s.selectByIndex(0);
		Thread.sleep(3000);
		s.selectByValue("v");
		Thread.sleep(3000);
		s.selectByVisibleText("dosa");
		Thread.sleep(3000);
		System.out.println("-----------------------");
		s.deselectByIndex(0);
		Thread.sleep(3000);
		s.deselectByValue("v");
		Thread.sleep(3000);
		s.deselectByVisibleText("dosa");
		Thread.sleep(3000);
		 boolean status = s.isMultiple();
		 System.out.println(status);
		 driver.close();
		
	}

}
