package qsp;



import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonAlligment {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(2000);
		int y1 = driver.findElement(By.xpath("//input[@value='1']")).getLocation().getY();
		int y2 = driver.findElement(By.xpath("//input[@value='2']")).getLocation().getY();
		int y3 = driver.findElement(By.xpath("//input[@value='-1']")).getLocation().getY();
		if(y1==y2 &&y2==y3 &&y1==y3)
		{
			System.out.println("gender radio button are proper allingned and pass");
		}
		else {
		System.out.println("gender radio button are not proper allingned and fail");
		
	}
		driver.close();
}
}
