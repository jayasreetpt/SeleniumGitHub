package firstprogram;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Fifthruncase{
	
	static WebDriver driver;
	
	

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@Test
	void test() throws Exception {
		driver.get("http://prakampanam.com/user");
		Thread.sleep(3000);
		driver.findElement(By.id("edit-name")).sendKeys("kiran");
		Thread.sleep(1000);
		driver.findElement(By.name("pass")).sendKeys("kiran@123");
		Thread.sleep(2000);
		driver.findElement(By.className("form-submit")).click();
		driver.findElement(By.id("edit-name")).clear();

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
