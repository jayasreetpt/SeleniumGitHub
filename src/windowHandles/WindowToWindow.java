package windowHandles;

import org.testng.annotations.Test;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowToWindow {
	WebDriver driver;
  
  @Test
  public void WindowHandleMethod() throws InterruptedException {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.google.com");
	  Thread.sleep(3000);
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com");
	  Thread.sleep(3000);
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.youtube.com");
	  Thread.sleep(3000);
 
	  Set<String> S =driver.getWindowHandles();
	  Object s[] = S.toArray();
	  driver.switchTo().window(s[0].toString());
  }
}
