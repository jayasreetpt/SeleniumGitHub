package verificationMethods;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class TsestNG_16_UrlText {
	WebDriver driver;
	
  @Test
  public void UrlText() {
 driver.get("https://www.google.com");
	  
	  String expUrl = "https://www.google.com/";
	  System.out.println("exptitle:"+expUrl);
	  
	  String actUrl =driver.getCurrentUrl();
	  System.out.println("actUrl:"+actUrl);
	  
	  Assert.assertEquals(actUrl, expUrl);
	  
	
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
