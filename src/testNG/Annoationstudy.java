package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annoationstudy {
  @Test
  public void validatepin() {
	  Reporter.log("pin validation done-->@Test is used", true);
  }
  @Test
  public void validateuserid() 
  {
	  Reporter.log("validate userid done--> @Test is used", true);
  }
  @BeforeMethod
  public void login() 
  {
	  Reporter.log("login done successfully--> @BeforeMethod is used", true);
  }
  @AfterMethod
  public void logout()
  {
	  Reporter.log("logout done successfully--> @AfterMethod is used", true);
  }
  @BeforeClass
  public void Launchbrowser() 
  {
	  Reporter.log("browser launch successfully--> @BeforeClass is used", true);
  }
  @AfterClass
  public void closebrowser() 
  {
	  Reporter.log("close browser successfully-->@AfterClass is used", true);
  }
}
