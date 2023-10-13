package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DataOfBirth_handlingSingleListbox {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(2000);
		WebElement dayListbox = driver.findElement(By.id("day"));
		Select s=new Select(dayListbox);
		s.selectByIndex(26);
		WebElement monthListbox =driver.findElement(By.id("month"));
		Thread.sleep(3000);
		Select s1=new Select(monthListbox);
		
		s1.selectByValue("6");
		WebElement yearListbox = driver.findElement(By.id("year"));
		Thread.sleep(3000);
		Select s2=new Select(yearListbox);
		s2.selectByVisibleText("1995");

	}

}
