package neostox;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class neostoxBase {
   protected WebDriver driver;
 
        public void launchbrowser() throws EncryptedDocumentException, IOException {
	    System.setProperty("webdriver.chrome.driver", ("D:\\Important\\Shilpa\\selenium\\chromedriver_win32\\chromedriver.exe"));
		 driver=new ChromeDriver();
		driver.get(neostoxUtility.readdatafromexcel(2, 5));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
	  
  }
}
