package upstoxpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Upstoxlogin 
{
        //variable declaration
	
	@FindBy(xpath="//input[@name='userId']")private WebElement UserID;
	@FindBy(xpath="//input[@name='password']") private WebElement Pwd;
	@FindBy(xpath="//button[@type='submit']") private WebElement Loginbutton;
	
	    //variable initialisation with constructor
	
	public Upstoxlogin(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	 public void Enteruserid() 
	 {
		 UserID.sendKeys("4YB8VB");
	 }
	public void Enterpassword() 
	{
		Pwd.sendKeys("Esh@7551gm");
	}
	public void ClickonloginButton() 
	{
		Loginbutton.click();
	}
	
}
