package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Spicejet_roundtrip {
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
     driver.findElement(By.xpath("//div[text()='round trip']")).click();
     
     driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']//input")).sendKeys("del");
     driver.findElement(By.xpath("//div[@data-testid='to-testID-destination']//input")).sendKeys("blr");
     
 //   driver.findElement(By.xpath("//div[@data-testid='undefined-month-February-2023']//div[@data-testid='undefined-calendar-day-24']")).click();
       ////div[@data-testid='undefined-month-December-2022']/div[3]/div[4]/div[7]
   // driver.findElement(By.xpath("//div[@data-testid='undefined-month-February-2023']//div[@data-testid='undefined-calendar-day-4']")).click();
    
}
}
