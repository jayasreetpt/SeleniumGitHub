package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_6_DependsOnMethods {
	WebDriver driver;

	@Test(dependsOnMethods="tajmahalLink")
	public void tajmahal() {
		driver.findElement(By.name("q")).sendKeys("tajmahal");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"hdtb-msb\"]/div[1]/div/div[2]/a")).click();
	}
	@Test
	public void tajmahalLink() {
		driver.get("https://www.google.com");
		
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
	}

	@AfterTest
	public void afterTest() {
	}

}
