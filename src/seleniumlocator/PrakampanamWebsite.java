package seleniumlocator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class PrakampanamWebsite {
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new FirefoxDriver();
		driver.manage().window().minimize();
		driver.manage().window().maximize();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		
		driver.quit();
	}

	@Test
	void test() throws Exception {
		
		driver.get("http://prakampanam.com/user");
		Thread.sleep(2000);
		driver.findElement(By.id("edit-name")).sendKeys("vishnuteja");
		Thread.sleep(2000);
		driver.findElement(By.name("pass")).sendKeys("vishnu@123");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".form-submit")).click();
		//driver.findElement(By.className("form-submit")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("edit-name")).clear();
		Thread.sleep(2000);
		driver.findElement(By.linkText("హోమ్")).click();
		Thread.sleep(2000);
		
		
		
	}

}
