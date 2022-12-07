package generalised;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Clickandsendkeys       //we can click and sendkeys by 3 methods 1>--webelement method 
                                                                           //2>--action class method 
                                                                           //3>--javascriptexecutor method
{
	public static void click(WebDriver driver ,String name) 
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("argument[0].click()", name);
	}
	public static void sendkeys(WebDriver driver,WebElement element) 
	{
		JavascriptExecutor jc=(JavascriptExecutor)driver;
		jc.executeScript("arguments[0].ScrollIntoView()", element);
	}
	
}
