package upstoxpomusingexcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Upstoxwelcomeusingexcel 
{
	
	@FindBy(xpath="//div[text()='No, I’m good']")private WebElement iamgood;
	
	public Upstoxwelcomeusingexcel(WebDriver driver) 
	{
		
		PageFactory.initElements(driver, this);
	}
	
	public void iamgood() 
	{
		iamgood.click();
	}

}
