package qsp;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileuploadPoUp {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Me/Desktop/Naukri.html");
	File f=new File("./data/AMIT RESUME.docx");
	Thread.sleep(4000);
	String absolutepath = f.getAbsolutePath();
	driver.findElement(By.id("cv")).sendKeys(absolutepath);
	}

}
