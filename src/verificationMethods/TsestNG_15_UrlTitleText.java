package verificationMethods;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class TsestNG_15_UrlTitleText {
	WebDriver driver;
	
  @Test
  public void UrlTitleText1() {
  driver.get("https://www.google.com");
	  
	  String exptitle = "Google";
	  System.out.println("exptitle:"+exptitle);
	  
	  String acttitle =driver.getTitle();
	  System.out.println("acttitle:"+acttitle);
	  
	  Assert.assertEquals(acttitle, exptitle);
	  
	
  }
  @Test
  public void UrlTitleText() {
	  driver.get("https://www.google.com");
	  
	  String expUrl = "https://www.google.com/";
	  System.out.println("exptitle:"+expUrl);
	  
	  String actUrl =driver.getCurrentUrl();
	  System.out.println("acttitle:"+actUrl);
	  
	  Assert.assertEquals(actUrl, expUrl);
	  
	
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
