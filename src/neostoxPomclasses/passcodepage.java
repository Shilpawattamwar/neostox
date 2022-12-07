package neostoxPomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class passcodepage {
	
	
	
	@FindBy(xpath="//input[@inputmode='numeric']")private WebElement passcodefield;
	
	
	@FindBy(id="lnk_submitaccesspin")private WebElement submitbutton;
	
	
	public passcodepage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	@Test
	public void enterpasscode(String pass) 
	{
		passcodefield.sendKeys(pass);
		Reporter.log("sending password......", true);
	}
	@Test
	public void clickonsubmit()
	{
		submitbutton.click();
	}
	
  }

