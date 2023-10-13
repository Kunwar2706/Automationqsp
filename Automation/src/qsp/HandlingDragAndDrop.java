package qsp;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingDragAndDrop {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		Actions a=new Actions(driver);
		WebElement src = driver.findElement(By.xpath("//h1[text()='Block 1']"));
		WebElement dest = driver.findElement(By.xpath("//h1[text()='Block 4']"));
		Thread.sleep(2000);
		a.dragAndDrop(src, dest).perform();
}
}
