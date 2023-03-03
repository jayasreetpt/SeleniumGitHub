package alertMethods;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class TestNG_7_AlertWindowOkButton {
	WebDriver driver;
  @Test
  public void selenium() throws Exception {
	  driver.get("http://www.seleniumlearn.com/how-handle-alert-box-using-selenium");
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[@id=\"node-100\"]/div/div[1]/div/div/button")).click();
	  Thread.sleep(3000);
	  driver.switchTo().alert().accept();
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
