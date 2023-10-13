package qsp;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import bsh.util.Util;

public class NaukariAutomation {
	static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, IOException {
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.naukri.com/");
    driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.manage().window().maximize();
    WebElement job = driver.findElement(By.xpath("//div[text()='Jobs']"));
      Actions act=new Actions(driver);
      act.moveToElement(job).perform();
      driver.findElement(By.xpath("//div[text()='IT jobs']")).click();
      JavascriptExecutor j=(JavascriptExecutor)(driver);
      Thread.sleep(5000);
      j.executeScript("window.scrollBy(0,10000)");
         WebElement ts = driver.findElement(By.xpath("//div[@class='nI-gNb-social-links']"));
      //TakesScreenshot ts=(TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshot/s1s.png");
	    FileUtils.copyFile(src, dest);
		}
	
      }


