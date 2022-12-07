package upstoxpom;

import org.openqa.selenium.SearchContext;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Upstoxwelcome
{
	
	
	@FindBy(xpath="//div[text()='No, I’m good']")private WebElement iamgood;
	
	public Upstoxwelcome(WebDriver driver) 
	{
		
		PageFactory.initElements(driver, this);
	}
	
	public void iamgood() 
	{
		iamgood.click();
	}
	
	
	
}
