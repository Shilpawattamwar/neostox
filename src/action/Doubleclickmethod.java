package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclickmethod {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Important\\Shilpa\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/V4/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
	//	WebElement loginbutton = driver.findElement(By.xpath("//input[@type='submit']"));
	//	loginbutton.click();                                                 //webelement method
		
		
		WebElement loginbutton = driver.findElement(By.xpath("//input[@type='submit']"));
		 
		Actions act=new Actions(driver);
		
	//	act.moveToElement(loginbutton).perform();
	//	act.doubleClick().perform();                           //1st way
		
//		act.moveToElement(loginbutton).doubleClick().build().perform();               //2nd way
		
		act.doubleClick(loginbutton).perform();
		
	}

}
