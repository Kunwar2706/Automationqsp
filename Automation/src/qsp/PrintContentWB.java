package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintContentWB {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/Me/Desktop/table.html");
	List<WebElement> allContent = driver.findElements(By.xpath("//td"));
	 int count = allContent.size();
	 System.out.println(count);
	 for(WebElement b:allContent)
	 {
    String text = b.getText();
    System.out.println(text);
	}
driver.close();

}
}
