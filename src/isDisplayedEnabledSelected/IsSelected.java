package isDisplayedEnabledSelected;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;

public class IsSelected {
	WebDriver driver;
	
  @Test
  public void f() {
		driver.get("https://www.redmine.org/login");
		
		driver.findElement(By.xpath("//*[@id=\"autologin\"]")).click();

		Boolean checkbox = driver.findElement(By.xpath("//*[@id=\"autologin\"]")).isSelected();

		if (checkbox == true) {
			System.out.println("By default Checkbox is selected");
		}

		else {
			System.out.println("By default Checkbox is Not selected");
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
