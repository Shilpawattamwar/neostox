package keyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboardaction {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Important\\Shilpa\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bk.com/");
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		WebElement signupb = driver.findElement(By.xpath("//button[text()='Sign Up']"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(signupb).click(signupb).build().perform();
		
		Thread.sleep(3000);
	//	driver.findElement(By.id("floating-label-input-1")).click();               webelement method
		
		 WebElement name = driver.findElement(By.id("floating-label-input-1")); 
		 name.click();
		 
	//	 act.click(name).sendKeys(name, "Shilpa").build().perform();           // keyboard action 1 st way
		 
		 Thread.sleep(3000);
		act.keyDown(Keys.SHIFT).sendKeys("s").keyUp(Keys.SHIFT).sendKeys("hilpa").build().perform();
		
		
	}

}
