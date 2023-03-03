package sikuli;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class SikuliDemo {
	Screen s = new Screen();
  @Test
  public void Sikuli() throws FindFailed, Exception {
	  
	  s.click("D:\\lib\\Vish\\V1.PNG");
  }
}
