package neostoxusingproperties;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;


public class Utility1 {
	
	
	  public static String readdatafromproperties(String key) throws IOException {
		       Properties prop=new Properties();
		       FileInputStream myfile = new FileInputStream("D:\\Important\\Shilpa\\eclipse workspace\\Automation\\src\\firstproperties.properties");
		
		            prop.load(myfile);
		    
		       String value=prop.getProperty(key);
		      return value;  //here we made this method as String and excel gives value so we take return value  
			  
		  }  
			 
			  public static void Screenshot(WebDriver driver,String abcde) throws IOException 
			  {
				  File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				  File destination = new File("D:\\Important\\Shilpa\\selenium\\screenshot"+abcde+".jpeg/.jpg");
				  FileHandler.copy(source, destination);
				  Reporter.log("taking screenshot....", true);
			  }
			 
			  public void waitmethod(WebDriver driver, int time) {
				  
				  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(time));
				  
				  
			  }

	
	
	

}
