package seleniumlocator;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

class TagName {
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}
	
   
	@Test
	void test1() throws Exception {
		
		driver.get("https://google.com/");
		Thread.sleep(3000);
		List<WebElement> total = driver.findElements(By.tagName("a"));
		System.out.println("TotalLinks:"+total.size());
	}
    @Disabled
	@Test
	void test() {
		
		driver.get("https://redmine.org/");
		driver.findElement(By.xpath("//*[@id='q']")).sendKeys("vishnu");
		driver.findElement(By.xpath("//*[@id='q']")).sendKeys(Keys.ENTER);
	
	}

}
