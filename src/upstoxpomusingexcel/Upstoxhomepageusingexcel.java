package upstoxpomusingexcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Upstoxhomepageusingexcel 
{

	 @FindBy(xpath="//span[text()='eshwar t.']") private WebElement Username;     //variable declaration
	 @FindBy(id="funds")private WebElement fund;
	 @FindBy(id="logout")private WebElement Logoutb;
     
		public Upstoxhomepageusingexcel(WebDriver driver) 
		{
			PageFactory.initElements(driver, this);         //variable initialisation
		}
		
		    //variable usage
		
		public void Useridvalidation() 
		{
			String actualuserid = Username.getText();
			String expecteduserid = "Eshwar T.";
			
			if(actualuserid.equals(expecteduserid)) 
			{
				System.out.println("TC passed user id is matching");
			}
			else 
			{
				System.out.println("TC failed user id is not matching");
			}
	
		}
	 
	 
	  
	  public void fundvalidation() 
	  {
		  fund.click();
	  }
	  
	  public void Logoutbutton() 
	  {
		  Username.click();
		 System.out.println( Logoutb.isDisplayed());
		  Logoutb.click();
	  }
	
		}
