package seleniumlocator;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Seleniumelements {
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass()  {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	driver.quit();	
	}
	

	@Test
	void test1() throws Exception {
		driver.get("https://redmine.org");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("username")).sendKeys("shankar");
		driver.findElement(By.name("password")).sendKeys("hem@123");
		driver.findElement(By.id("autologin")).click();
		driver.findElement(By.partialLinkText("Lost password")).click();
		driver.findElement(By.name("login")).click();
		driver.findElement(By.id("username")).clear();
		Thread.sleep(3000);
	}
		
		
	}
	
