package qsp;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cricket {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args){
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/t20i");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 List<WebElement> teams = driver.findElements(By.xpath("//tbody/tr/td[2]/span[2]"));
           List<WebElement> points = driver.findElements(By.xpath("//tbody/tr//td[4]"));
           
           for(int i=0;i<=teams.size();i++)
           {
        	 System.out.println(teams.get(i).getText()+"="+points.get(i).getText());
           }
}
}  
