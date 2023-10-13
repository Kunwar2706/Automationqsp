package qsp;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllDuplicateOPtion {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		HashSet<String>hs=new HashSet<String>();
		driver.get("file:///C:/Users/Me/Desktop/Hotel.html");
		WebElement mtrLixtbox = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrLixtbox );
		List<WebElement> allOptions = s.getOptions();
		int count=allOptions.size();
		for(int i=0;i<count;i++);
		{
			int i = 0;
			String text = allOptions.get(i).getText();
		}
		String text = null;
		if(hs.add(text)==false)
		{
			System.out.println(text);
		}
		driver.close();
	}

}
