package upstoxpomusingexcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Upstoxloginusingexcel 
{
	 //variable declaration
	
		@FindBy(xpath="//input[@name='userId']")private WebElement UserID;
		@FindBy(xpath="//input[@name='password']") private WebElement Password;
		@FindBy(xpath="//button[@type='submit']") private WebElement Loginbutton;
		
		    //variable initialisation with constructor
		
		public Upstoxloginusingexcel(WebDriver driver) 
		{
			PageFactory.initElements(driver, this);
		}
		 public void Enteruserid(String UID) 
		 {
			 UserID.sendKeys(UID);
		 }
		public void Enterpassword(String PWD) 
		{
			Password.sendKeys(PWD);
		}
		public void ClickonloginButton() 
		{
			Loginbutton.click();
		}
	
	
	
	

}
