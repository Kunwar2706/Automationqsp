package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyAlliigmentXandYAxis {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		int x1 = driver.findElement(By.id("email")).getLocation().getX();
		int x2 = driver.findElement(By.id("pass")).getLocation().getX();
		
		int y1 = driver.findElement(By.id("email")).getLocation().getY();
		int y2 = driver.findElement(By.id("pass")).getLocation().getY();
		
if(x1==x2&& y1==y2)
{
	System.out.println("pass");

}
else
{
	System.out.println("fail");
}
	}

}
