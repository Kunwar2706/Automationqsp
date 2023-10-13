package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingframes_textCharAlternatively {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Me/Desktop/page1.html");
		driver.findElement(By.id("t1")).sendKeys("a");
		driver.switchTo().frame("f1");
		Thread.sleep(2000);
		driver.findElement(By.id("t2")).sendKeys("b");
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.id("t1")).sendKeys("c");
		WebElement e = driver.findElement(By.xpath("//iframe"));
		driver.switchTo().frame(e);
		Thread.sleep(2000);
		driver.findElement(By.id("t2")).sendKeys("d");
		
}
}
