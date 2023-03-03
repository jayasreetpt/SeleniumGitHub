package alertMethods;

import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class TestNG_9_PromtDialogBox {
	WebDriver driver;
  @Test
  public void sendtextAndOk() throws InterruptedException {
	  driver.get("http://seleniumlearn.com/prompt-dialog-box");
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
	  Thread.sleep(3000);
	  Alert alt = driver.switchTo().alert();
	  alt.sendKeys("vishnu");
	  alt.accept();
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
