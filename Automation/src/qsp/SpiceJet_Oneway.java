package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class SpiceJet_Oneway {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException{
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://www.spicejet.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		String fromCity="Del";
		 WebElement from = driver.findElement(By.xpath("//div[text()='From']/../div[2]/input"));
         from.sendKeys(fromCity);
         String toCity="blr";
         WebElement to = driver.findElement(By.xpath("//div[text()='To']/../div[2]/input"));
         to.sendKeys(toCity);
         String traveldate="20";
         Thread.sleep(2000);
         driver.findElement(By.xpath("(//div[text()='"+traveldate+"'])[1]")).click();
         Thread.sleep(2000);
         driver.close();
}		
}
