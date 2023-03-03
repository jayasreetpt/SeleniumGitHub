package actionClasses;

import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class TestNG_12_MouseHover {
	WebDriver driver;

	@Test
	public void sendtextAndOk() throws InterruptedException {
		driver.get("http://seleniumlearn.com/");
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu-336-1\"]"))).build().perform();
		Thread.sleep(3000);
		act.moveToElement(driver.findElement(By.linkText("Interview Q&A"))).click().build().perform();
		
		
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
