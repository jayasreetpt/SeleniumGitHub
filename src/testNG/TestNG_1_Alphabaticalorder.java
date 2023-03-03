package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_1_Alphabaticalorder {
	WebDriver driver;
	
  @Test
  public void google() {
	  driver.get("https://www.google.com");
  }
  
  @Test
  public void facebook() {
	  driver.get("https://www.facebook.com");
  }
  
  @Test
  public void redmine() {
	  driver.get("https://www.redmine.org");
  }
  
  @Test
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
