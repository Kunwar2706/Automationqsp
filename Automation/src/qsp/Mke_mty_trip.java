package qsp;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mke_mty_trip {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Actions action=new Actions(driver);
		action.moveByOffset(10,10).click().perform();
		
		/*String FromCity="Bengaluru";
		WebElement from = driver.findElement(By.id("fromCity"));
         from.sendKeys(FromCity);
         driver.findElement(By.xpath("//p[.='Bengaluru, India']")).click();
         String toCity="Mangalore";
        WebElement to = driver.findElement(By.id("toCity"));
        to.sendKeys(toCity);
        driver.findElement(By.xpath("//p[.='Mangalore, India']")).click();*/
		driver.findElement(By.xpath("//li[.='Round Trip']")).click();
		String fromCity="Bengaluru";
		WebElement from = driver.findElement(By.id(fromCity));
		from.sendKeys(fromCity);
		driver.findElement(By.xpath("//p[.='Bengaluru, India']")).click();
		String toCity = "Manglore";
		WebElement to = driver.findElement(By.id("toCity"));
		to.sendKeys("toCity");
		driver.findElement(By.xpath("//p[.='Mangalore, India']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='ic_circularclose_grey']")).click();//closing advertisement popup
	    Date date=new Date();
		String[] d=date.toString().split(" ");
		String day=d[0];
		String month=d[1];
		String cdate=d[2];
		String year=d[5];
		String travalDtate = day+" "+month+" "+cdate+" "+year;
		driver.findElement(By.xpath("//div[@aria-label='"+travalDtate+"']")).click();
		String rday="sat";
		String rmonth="feb";
		String rdate="04";
		String ryear="2023";
		String returnDtate = rday+" "+rmonth+" "+rdate+" "+ryear;
		for(;;)
		{
			try 
			{
				driver.findElement(By.xpath("//div[@aria-label='"+returnDtate+"']")).click();
				break;
			}
			catch(Exception e)
			{
				
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
		}
		driver.findElement(By.xpath("//a[text()='Search']")).click();
				
		
		
	
}
}
