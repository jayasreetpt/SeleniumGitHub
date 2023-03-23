package seleniumFrameworks;

import org.testng.annotations.Test;

import jxl.JXLException;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;

public class DataDrivenFramework_Validation {
	WebDriver driver;
	
  @Test
  public void f() throws IOException, JXLException, Exception {
	  
	  driver.get("http://prakampanam.com/user");
	  
		FileInputStream fi=new FileInputStream("D:\\lib\\Vishnu1.xls");
		Workbook w=Workbook.getWorkbook(fi);
		Sheet s=w.getSheet("Vishnu1");
		
		for(int i=1; i < s.getRows(); i++)
		{	
			driver.findElement(By.xpath("//*[@id=\"edit-name\"]")).sendKeys("Vishnu");
			driver.findElement(By.id("edit-name")).clear();
			driver.findElement(By.id("edit-name")).sendKeys(s.getCell(0, i).getContents());
			driver.findElement(By.id("edit-pass")).sendKeys(s.getCell(1, i).getContents());
			driver.findElement(By.id("edit-submit")).click();
			Thread.sleep(5000);
			try{
				Thread.sleep(3000);
				driver.findElement(By.linkText("Log out")).click();
				System.out.println("Pass");
				}
			catch(Exception e)
			{
				System.out.println("Fail");
			}
		}    
	}
  
  
  @BeforeTest
  public void beforeTest() {
	  ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");		
		driver = new ChromeDriver(co);
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
