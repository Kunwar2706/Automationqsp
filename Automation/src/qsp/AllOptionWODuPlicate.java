package qsp;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllOptionWODuPlicate {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
HashSet<String>hs=new HashSet<String>();
Thread.sleep(2000);
driver.get("file:///C:/Users/Me/Desktop/Hotel.html");
 WebElement mtrLixtbox = driver.findElement(By.id("mtr"));
 Select s=new Select(mtrLixtbox);
 Thread.sleep(2000);
List<WebElement> allOptions = s.getOptions();
int count = allOptions.size();
Thread.sleep(2000);
System.out.println(count);
for(int i=0;i<count;i++)
{
	 String text = allOptions.get(i).getText();
	 hs.add(text);
	 
}
        for(String text:hs)
        {
        	System.out.println(text);
        }
 driver.close();
	}

}
