package alertMethods;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class TestNG_8_ConfirmationWindowDismissButton {
	WebDriver driver;
  @Test
  public void selenium() throws Exception {
	  driver.get("http://seleniumlearn.com/confirmation-dialog-box");
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/main/div/section/div/div[3]/article/div/div[1]/div/div/button")).click();
	  Thread.sleep(3000);
	  driver.switchTo().alert().dismiss();
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
