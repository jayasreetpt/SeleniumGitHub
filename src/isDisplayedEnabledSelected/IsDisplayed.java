package isDisplayedEnabledSelected;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;

public class IsDisplayed {
	WebDriver driver;
	
  @Test
  public void f() {
	  driver.get("https://www.redmine.org/login");
	  
	  Boolean Text = driver.findElement(By.xpath("//*[@id=\"login-form\"]/form/label[1]")).isDisplayed();
	  if (Text== true) {
		  System.out.println("Login text is displayed");
	  }
	  else {
		  System.out.println("Login Text is not displayed");
	  }
		  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");		
		driver = new ChromeDriver(co);
	  driver.manage().window().maximize();
  }

}
