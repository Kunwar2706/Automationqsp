package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IccCricket {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args){
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/t20i");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		String countryname = "India";
		 WebElement points = driver.findElement(By.xpath("//span[.='"+countryname+"']/../following-sibling::td[2]"));
		System.out.println(points.getText());
		driver.close();
}
}

