package log4J;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


@Test
public class Demo {
	WebDriver driver;
	
  public void LogInfo() {
	  
	  Logger log = Logger.getLogger("Demo");
	  PropertyConfigurator.configure("Log4j.properties");
	  driver = new ChromeDriver(); 
	  log.info("Chrome Browser launched");
	  driver.manage().window().maximize();
	  log.info("Browser window maximized");
  }
}
