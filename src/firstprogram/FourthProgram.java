package firstprogram;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class FourthProgram {
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
	void test1() throws Exception {
		driver.get("https://www.google.com");
		Thread.sleep(3000);
	}
	@Test
	void test2() throws Exception {
		driver.get("https://www.facebook.com");
		Thread.sleep(3000);
	}

}
