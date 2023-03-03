package seleniumlocator;



import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class XpathLocator {
	
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		driver = new ChromeDriver();
		driver.manage().window().minimize();
		driver.manage().window().maximize();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		
	}

	@Test
	void test() throws Exception {
		
		driver.get("https://www.naukri.com/");
		driver.findElement(By.xpath("//a[@id=\"login_Layer\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div[2]/div/div/div[2]/div/form/div[2]/input")).sendKeys("vishnuteja");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div[2]/div/div/div[2]/div/form/div[3]/input")).sendKeys("vishnu@345");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div[2]/div/div/div[2]/div/form/div[6]/button")).click();
		
		
	}

}
