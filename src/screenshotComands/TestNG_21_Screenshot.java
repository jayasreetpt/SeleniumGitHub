package screenshotComands;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class TestNG_21_Screenshot {
	WebDriver driver;
	
  @Test
  public void Screenshot() throws IOException {
	  driver.get("https://www.google.com");
	  try {
	  driver.findElement(By.name("q")).sendKeys("automation");
	  driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	  driver.findElement(By.xpath("//*[@id=\"dtb-tls\"]")).click();
	    }
	  catch(Exception e) {
		  takeScreenshot();
	  }
	  }
  
  private void takeScreenshot() throws IOException {
	  File f= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(f, new File("D:\\lib\\WebDev\\FailedScreenshot.png"));
	  
  }
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
