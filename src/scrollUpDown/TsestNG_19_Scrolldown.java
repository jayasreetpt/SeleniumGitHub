package scrollUpDown;

import org.testng.annotations.Test;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class TsestNG_19_Scrolldown {
	WebDriver driver;

	@Test
	public void ScrollDown() {
		driver.get("https://www.selenium.dev");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 1500)");
		
	}
	@Test
	public void Scrollup() {
		driver.get("https://www.selenium.dev");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(1500, 0)");
		
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
