package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver driver;
	@Test
	public void f() throws Exception {
		driver.get("http://baalabharathi.com");
		driver.findElement(By.xpath("//i[@class=\" icon-magnifier\"]")).click();
		driver.findElement(By.xpath("//input[@name=\"s\"]")).sendKeys("upload story");
		driver.findElement(By.xpath("//input[@name=\"s\"]")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"titleiswpReadMe_386\"]")).click();
		driver.findElement(By.xpath("//input[@id='text-13263966988']")).sendKeys("vishnu");
		driver.findElement(By.xpath("//input[@id='text-241482569216']")).sendKeys("Vishnu@123");
		driver.findElement(By.xpath("//input[@id='text-23732060291']")).sendKeys("Vishnutej88@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='selected-dial-code']")).click();
		driver.findElement(By.xpath("//*[@id=\"iti-item-in\"]/span[1]")).click();
		driver.findElement(By.xpath("//input[@name=\"field-DVYLZM9QELAAq8K\"]")).sendKeys("9700487319");
		driver.findElement(By.xpath("//input[@id='field-krP8MPeuzRrukdo']")).sendKeys("5-14");
		driver.findElement(By.xpath("//input[@id='field-IQsTTT9SxEPs3LH']")).sendKeys("telephone colony");
		driver.findElement(By.xpath("//input[@id='field-2Ngu0gfcgyZYrFE']")).sendKeys("Tirupati");
		driver.findElement(By.xpath("//input[@id='field-5vlVJGcSKva7av0']")).sendKeys("517507");
		new Select(driver.findElement(By.xpath("//select[@id='field-5gVECDat8HE4BHW']"))).selectByVisibleText("India");
		new Select(driver.findElement(By.xpath("//select[@id='field-rUN19TKpQsSOX3X']"))).selectByValue("Ages 1-6 Years Audio Book");
		driver.findElement(By.xpath("//button[@id='button-20216154383']")).click();


	}
	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterTest(enabled=false)
	public void afterTest() {
		driver.quit();
	}

}
