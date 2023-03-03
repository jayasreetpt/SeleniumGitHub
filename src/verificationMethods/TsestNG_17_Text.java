package verificationMethods;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class TsestNG_17_Text {
	WebDriver driver;
	
  @Test
  public void Text() {
 driver.get("https://www.google.com");
	  
	  String expText = "Gmail";
	  System.out.println("expText:"+expText);
	  
	  String actText =driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[1]/div/div[1]/a")).getText();
	  System.out.println("actText:"+actText);
	  
	  Assert.assertEquals(actText, expText);
	  
	
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
