package navigationcommands;

import org.openqa.selenium.chrome.ChromeDriver;

public class webDriver {
static ChromeDriver driver;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(3000);

        driver.get("https://www.google.com");
        Thread.sleep(3000);
        driver.navigate().to("https://www.facebook.com");
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);

        driver.quit();

	}

}
