package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest1 {
  @Test
  public void browserlaunch() {
	  
	    System.setProperty("webdriver.chrome.driver", "D:\\Important\\Shilpa\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://login-v2.upstox.com/");
		Reporter.log("Browser launch successfully", true);
	  
  }
}
