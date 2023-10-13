package qsp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingMousehoverAndDoubleClick {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.vtiger.com/");
		WebElement resource = driver.findElement(By.partialLinkText("Resources"));
		Actions a=new Actions(driver);
		a.moveToElement(resource).perform();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Customers")).click();
		Thread.sleep(2000);
		WebElement doubleclick = driver.findElement(By.linkText("READ FULL STORY"));
		a.doubleClick(doubleclick).perform();
		boolean text = driver.findElement(By.xpath("//h1[text()='HackerEarth + Vtiger CRM']")).isDisplayed();
		if(text==true)
		{
			System.out.println("hacker earth oages displayed");
		}
	}
}
