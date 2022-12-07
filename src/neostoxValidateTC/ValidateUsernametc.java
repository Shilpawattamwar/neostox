package neostoxValidateTC;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.checkerframework.framework.qual.DefaultQualifier.List;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import neostox.neostoxBase;
import neostox.neostoxUtility;
import neostoxPomclasses.UsernamePage;
import neostoxPomclasses.neostoxHomepage;
import neostoxPomclasses.passcodepage;

//@Listners(neostox.neostoxUtility.class)

public class ValidateUsernametc extends neostoxBase{
	
	
	
 
	
	UsernamePage us;
	passcodepage pass;
	neostoxHomepage homep;
	
	//@beforeClass===> launch browser
	//@beforeMethod===>login to application
    //@test===>validate username and fund
	//@afterMethod===>logout
	//@afterClass===>close the browser
	
	
	@BeforeClass
	public void openbrowser() throws InterruptedException, EncryptedDocumentException, IOException
		{
		launchbrowser();

		
		us=new UsernamePage(driver);
		pass=new passcodepage(driver);
		homep=new neostoxHomepage(driver);
	}
	@BeforeMethod
	public void logintoapp() throws InterruptedException, EncryptedDocumentException, IOException 
	{
		us.entermobileno(neostoxUtility.readdatafromexcel(2, 0));
		
		us.signupbuttonclick();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		pass.enterpasscode(neostoxUtility.readdatafromexcel(2, 1));
		Thread.sleep(2000);
		
		pass.clickonsubmit();
		
		Thread.sleep(3000);
		
		homep.clickonpopupok();
		
		Thread.sleep(3000);
		
		homep.clickpopupclose();
		
	}
	
	@Test
	public void validateusernamem() throws EncryptedDocumentException, IOException 
	
	{
		  
		Assert.assertEquals(homep.validateuserid(),neostoxUtility.readdatafromexcel(2,3),"actual and expected username is not matching so tc is failed" );
	}
	@AfterMethod
	public void logoutfromappli() throws InterruptedException 
	{
	  //	homep.validatefunds();
	//	Thread.sleep(3000);;
		homep.logoutfromapp();
	}
	@AfterClass
	public void closebrowser() 
	{
		driver.close();
		Reporter.log("closing the browser....", true);
		
	}

}
