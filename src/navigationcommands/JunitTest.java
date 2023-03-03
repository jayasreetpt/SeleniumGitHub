package navigationcommands;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class JunitTest {
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
    @Disabled
	@Test
	void google()  {
		driver.get("https://www.google.com");
	
	}
	@Test
	void twitter()  {
		driver.get("https://www.twitter.com");
		
	}
	@Test
	void facebook()  {
		driver.get("https://www.facebook.com");
		
	}
	@Test
	void youtube()  {
		driver.get("https://www.youtube.com");
	
	}
	@Disabled
	@Test
	void amazon()  {
		driver.get("https://www.amazon.com");
		
	}

}
