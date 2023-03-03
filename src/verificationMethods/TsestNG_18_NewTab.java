package verificationMethods;

import org.testng.annotations.Test;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class TsestNG_18_NewTab {
	WebDriver driver;

	@Test
	public void Text() {
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElement(By.xpath("//a[@aria-label='Menu BUSES. Website will be opened in new tab']")).click();
        ArrayList<String> newtab = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(newtab.get(1));
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
