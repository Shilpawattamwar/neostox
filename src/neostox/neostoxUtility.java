package neostox;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class neostoxUtility {
  
  
	  
	//Utility class is used to store genralize method which can be used
	//  multiple time or to reuse like:
	  //Excel
	   //Screenshot
	   //Scrolling
	   //Wait
	  
	   //All our testdata is store in excel sheet like password ,id
	   //So make a method to read the data from excel
	   //WE need to make static method to read the data from excel and we have
	  //passed(row,cell)in it because we will mention
	   //row and cell in testNG class
	   //We have made it "string" return type because after reading data this
	  //method will give data in string
	  public static String  readdatafromexcel(int row, int cell) throws EncryptedDocumentException, IOException {
	  
    File myfile = new File("D:\\Important\\Shilpa\\eclipse workspace\\examples.xlsx");
   	Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet7");
	String value = mysheet.getRow(row).getCell(cell).getStringCellValue();
	 Reporter.log("reading data from excel....", true);
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
  

