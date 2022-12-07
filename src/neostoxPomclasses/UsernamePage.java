package neostoxPomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class UsernamePage {
	
	@FindBy(xpath="(//input[@class='form-control'])[1]") private  WebElement mobilenofield;
	
	@FindBy(id="lnk_signup1")private WebElement signupbutton;
	
	
	public UsernamePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void entermobileno(String name) 
	{
	      mobilenofield.sendKeys(name);
	      Reporter.log("sending mobileno.....", true);
	}
	public void signupbuttonclick()
	{
		 signupbutton.click();
		 Reporter.log("clicking on signupbutton....", true);
	}
	
  
  
}
