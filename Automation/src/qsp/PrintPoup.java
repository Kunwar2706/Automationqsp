package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class PrintPoup {
static {
	//System.setProperty("webdriver.gecko.driver", "./driver/gickodriver.exe");
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws AWTException, InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("https://www.selenium.dev/downloads/");
Robot r=new Robot();
r.keyPress(KeyEvent.VK_CONTROL);
r.keyPress(KeyEvent.VK_P);
r.keyRelease(KeyEvent.VK_CONTROL);
Thread.sleep(1000);
r.keyPress(KeyEvent.VK_TAB);
Thread.sleep(1000);
r.keyPress(KeyEvent.VK_TAB);
Thread.sleep(1000);
r.keyPress(KeyEvent.VK_TAB);
Thread.sleep(1000);
r.keyRelease(KeyEvent.VK_TAB);
Thread.sleep(1000);
r.keyPress(KeyEvent.VK_DOWN);
Thread.sleep(1000);
r.keyPress(KeyEvent.VK_DOWN);
Thread.sleep(1000);
r.keyPress(KeyEvent.VK_DOWN);
Thread.sleep(1000);
r.keyPress(KeyEvent.VK_1);
r.keyPress(KeyEvent.VK_MINUS);
r.keyPress(KeyEvent.VK_2);
r.keyPress(KeyEvent.VK_ENTER);
	}

}
