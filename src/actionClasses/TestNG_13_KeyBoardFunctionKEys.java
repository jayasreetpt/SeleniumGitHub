package actionClasses;

import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class TestNG_13_KeyBoardFunctionKEys {
	WebDriver driver;

	@Test
	public void sendtextAndOk() throws InterruptedException {
		driver.get("https://redmine.org/login");
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.TAB).build().perform();
		
        
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
