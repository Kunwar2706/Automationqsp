package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VeryfyingUrlNavigation {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[]arg) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://seleniumhq.org");
		Thread.sleep(4000);
		String expectedUrl ="https://www.selenium.dev/";
        Thread.sleep(4000);
		String actualUrl = driver.getCurrentUrl();
				Thread.sleep(4000);
		if(actualUrl.equals(expectedUrl))
		{
		System.out.println("url navigating sucessfully & pass");
		}
		else
		{
			System.out.println("url navigating is not sucessfully& fail");
		}
		driver.close();
		
	}
}

