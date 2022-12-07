package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Clickmethod {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Important\\Shilpa\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
	//	WebElement Radiobutton = driver.findElement(By.xpath("(//input[@name='radio'])[1]"));
	//	Radiobutton.click();                                          //webelement method
	//	Thread.sleep(3000);
	
		WebElement Radiobutton1 = driver.findElement(By.xpath("(//input[@name='radio'])[1]"));
		
		Actions act=new Actions(driver);
		
//		act.moveToElement(Radiobutton1).perform();
//		act.click().perform();                                                //1st way
		
		
//		act.moveToElement(Radiobutton1).click().build().perform();               //2nd way
		
		
		act.click(Radiobutton1).perform();                                      //3rd way
	}

}
