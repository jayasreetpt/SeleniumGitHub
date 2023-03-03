package firstprogram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondTest {
 
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException  {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(4000);
driver.close();
	}
	

}
