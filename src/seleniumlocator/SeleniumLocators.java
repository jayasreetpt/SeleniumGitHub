package seleniumlocator;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class SeleniumLocators {
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		driver.quit();
	}

	@Test
	void test() throws Exception {
		
		driver.get("https://redmine.org/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Sign in")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("vishnu");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("vishnu@123");
		Thread.sleep(2000);
		driver.findElement(By.id("autologin")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Lost password")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("mail")).sendKeys("vishnutej88@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("commit")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Home")).click();
		Thread.sleep(2000);
	}

}
