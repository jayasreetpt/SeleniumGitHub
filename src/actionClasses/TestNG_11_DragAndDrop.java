package actionClasses;

import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class TestNG_11_DragAndDrop {
	WebDriver driver;
  @Test
  public void sendtextAndOk() throws InterruptedException {
	  driver.get("http://www.seleniumlearn.com/drag-and-drop-html");
	  Thread.sleep(5000);
	  WebElement source = driver.findElement(By.id("draggable"));
	  WebElement target = driver.findElement(By.id("droppable"));
	  Actions act = new Actions(driver);
	  act.dragAndDrop(source, target).build().perform();
  }
	  
	  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
