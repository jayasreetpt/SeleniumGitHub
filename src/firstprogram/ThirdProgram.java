package firstprogram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThirdProgram {
      static WebDriver driver;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
       
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.manage().window().minimize();
		
		Thread.sleep(4000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.close();
       
	}

}
