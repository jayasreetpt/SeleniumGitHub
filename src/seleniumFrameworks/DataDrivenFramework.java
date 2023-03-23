package seleniumFrameworks;

import org.testng.annotations.Test;

import jxl.JXLException;
import jxl.Sheet;
import jxl.Workbook;
import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;

public class DataDrivenFramework {
	WebDriver driver;
  @Test
  public void DataDriven() throws IOException, JXLException, Exception{
		driver.get("http://prakampanam.com/user");
		Thread.sleep(3000);

		FileInputStream fi = new FileInputStream("C:\\Users\\vishn\\Downloads\\Vishnu1.xlsx"); // Here your xls path.
		Workbook w = Workbook.getWorkbook(fi);
		Sheet s = w.getSheet(0);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"edit-name\"]")).sendKeys(s.getCell(0, 1).getContents());
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"edit-pass\"]")).sendKeys(s.getCell(1, 1).getContents());
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"edit-submit\"]")).click();
	} 

  @BeforeTest
  public void beforeTest() throws IOException, JXLException {
	  ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");		
		driver = new ChromeDriver(co);
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
