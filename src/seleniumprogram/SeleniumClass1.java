package seleniumprogram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumClass1 {
	
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.close();
	 
		

	}

}
