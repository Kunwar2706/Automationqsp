package qsp;

import java.util.ArrayList;
import java.util.Collections;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllOptionAOrder {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args ) {
		WebDriver driver=new ChromeDriver();
		ArrayList<String> al=new ArrayList<String>();
		driver.get("file:///C:/Users/Me/Desktop/Hotel.html");
		WebElement mtrLixtbox = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrLixtbox );
		List<WebElement> allOptions = s.getOptions();
		int count=allOptions.size();
		System.out.println(count);
		
		for(int i=0;i<count;i++)
		{
		String text = allOptions.get(i).getText();
			al.add(text);
		}
		Collections.sort(al);
		System.out.println(al);
		for(String text:al)
		{
			System.out.println(text);
		}
	}

}
