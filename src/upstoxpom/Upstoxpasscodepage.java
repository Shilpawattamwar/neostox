package upstoxpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Upstoxpasscodepage
{
	//variable declaration
    @FindBy(name="yob")private WebElement Passcodepage;
    
    
    //variable initialisation with constructor
    public Upstoxpasscodepage(WebDriver driver) 
    {
    	PageFactory.initElements(driver, this);
    }
    
    //variable usage
    
    public void Enterpasscode() 
    {
    	Passcodepage.sendKeys("1993");
    }
   
    
}
