package isDisplayedEnabledSelected;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;

public class IsEnabled {
	WebDriver driver;
  @Test
  public void f() {
  driver.get("https://www.redmine.org/login");
	  
	  Boolean textfield = driver.findElement(By.xpath("//*[@id=\"username\"]")).isEnabled();
	  
	  if(textfield==true)
	  {
		  System.out.println("Login Text Box is enabled to enter the username");
		  driver.findElement(By.id("username")).sendKeys("Kiran");
	  }
	  
	  else {
		  System.out.println("Login Text Box is NOT enabled to enter the username");
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
