package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HiddenPopUp2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.id("policynumber")).sendKeys("123");
		driver.findElement(By.id("dob")).click();
		WebElement year = driver.findElement(By.xpath("(//select)[2]"));
		Select y =new Select(year);
		y.selectByValue("1995");
		WebElement month = driver.findElement(By.xpath("(//select)[1]"));
		Select s=new Select(month);
		s.selectByIndex(6);
		driver.findElement(By.linkText("27")).click();
		driver.findElement(By.id("alternative_number")).sendKeys("6203882721");
		driver.findElement(By.id("renew_policy_submit")).click();
		boolean test = driver.findElement(By.id("policynumberError")).isDisplayed();
		if(test=true)
		{
			System.out.println("please inter vaild policy no  is displayed");
		}

	}
}
