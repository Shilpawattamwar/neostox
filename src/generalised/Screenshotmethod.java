package generalised;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshotmethod {


	public static void Screenshotm(WebDriver driver,String name) throws IOException 
	{
	
	    File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 
	    File desti = new File("D:\\Important\\Shilpa\\selenium\\screenshot"+name+".jpg");
		
		FileHandler.copy(src, desti);
		
	}
		

	}


