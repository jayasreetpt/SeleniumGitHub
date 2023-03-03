package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_4_Description {
	WebDriver driver;
	
  @Test(priority=1, enabled=false)
  public void google() {
	  driver.get("https://www.google.com");
  }
  
  @Test(priority=3, description="facebook login")
  public void facebook() {
	  driver.get("https://www.facebook.com");
  }
  
  @Test(priority=2)
  public void redmine() {
	  driver.get("https://www.redmine.org");
  }
  
  @Test(priority=4, enabled=false)
  public void twitter() {
	  driver.get("https://www.twitter.com");
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
