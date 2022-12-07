package flipkartpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Loginpage {
	
	
	@FindBy(xpath="(//input[@type='text'])[2]")private WebElement emailfield;
	
	@FindBy(xpath="//input[@type='password']")private WebElement passwordField;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")private WebElement Loginbutton;
	
	
	public Loginpage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
  @Test
  public void enteremailid(String username) {
	  emailfield.sendKeys(username);
	  Reporter.log("entering username....",true);
  }
  
  @Test
  public void enterpassword(String pass) 
  {
	  passwordField.sendKeys(pass);
	  Reporter.log("entering password....",true);
	  
  }
  
  
  
  
}
