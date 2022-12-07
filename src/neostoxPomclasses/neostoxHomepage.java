package neostoxPomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class neostoxHomepage {
	
	@FindBy (xpath="(//a[@class='btn btn-sm neobutton'])[7]")private WebElement popupok;
	@FindBy (xpath="(//a[text()='Close'])[5]")private WebElement popupclose;
	@FindBy (xpath="(//span[text()='Hi Yogendra Joshi'])[1]")private WebElement userid;
	@FindBy (id="lbl_curbalancetop")private WebElement funds;
	@FindBy (xpath="//span[text()='Logout']")private WebElement logout;
	
	
	public neostoxHomepage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public void clickonpopupok() 
	{
		System.out.println(popupok.isDisplayed());
		popupok.click();
	}
	
	public void clickpopupclose() 
	{
		popupclose.click();
	}
	
	public String validateuserid() 
	{
		String actualuserid = userid.getText();
		Reporter.log("getting actual userid", true);
		return actualuserid;
	}
	
	public String validatefunds() 
	{
		String value = funds.getText();
		Reporter.log("getting funds",true);
		return value;
	}
	
   public void logoutfromapp() 
   {
	   funds.click();
	   logout.click();
	   Reporter.log("clicking on logout button.....",true);
   }
  }

