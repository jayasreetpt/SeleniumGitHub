package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_5_TimeOut {
	WebDriver driver;

	@Test(timeOut=2000, groups="model")
	public void tajmahal() {
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("tajmahal");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"hdtb-msb\"]/div[1]/div/div[2]/a")).click();
		}
	@Test(groups="hero")
	public void ramcharan() {
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Ramcharan");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"hdtb-msb\"]/div[1]/div/div[2]/a")).click();
		}
	@Test(groups="hero")
	public void prabhas() {
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("prabhas");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"hdtb-msb\"]/div[1]/div/div[2]/a")).click();
		}
	@Test(groups="model")
	public void redfort() {
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Redfort");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"hdtb-msb\"]/div[1]/div/div[2]/a")).click();
		}


	@BeforeTest(groups="hero")
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterTest
	public void afterTest() {
	}

}
