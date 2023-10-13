package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintTagNameHrfAV {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		String name = driver.findElement(By.id("toPasswordRecoveryPageLink")).getTagName();
		String attri = driver.findElement(By.id("toPasswordRecoveryPageLink")).getAttribute("href");
		System.out.println(name);
		System.out.println(attri);
		driver.close();
	}

}
