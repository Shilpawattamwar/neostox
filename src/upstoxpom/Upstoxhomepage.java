package upstoxpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Upstoxhomepage 
{
     @FindBy(xpath="//span[text()='eshwar t.']") private WebElement Userid;     //variable declaration
     
	public Upstoxhomepage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);         //variable initialisation
	}
	
	    //variable usage
	
	public void Useridvalidation() 
	{
		String actualuserid = Userid.getText();
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
	
	
	
}
