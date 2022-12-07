package keyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard2 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Important\\Shilpa\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@type='submit'])[3]")).click();
		Thread.sleep(3000);
	    WebElement createaccount = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		
		 Actions act=new Actions(driver);
		
		 act.click(createaccount).perform();
		 
		 Thread.sleep(3000);
		 
		WebElement day = driver.findElement(By.id("day"));
		act.click(day).perform();
		Thread.sleep(3000);
//		act.sendKeys(Keys.ARROW_UP).sendKeys(Keys.ARROW_UP).sendKeys(Keys.ARROW_UP).sendKeys(Keys.ENTER).build().perform();
		
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER);
		
		WebElement month = driver.findElement(By.id("month"));
		act.click(month).perform();
		for(int i=0;i<=4;i++) {
			
		act.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(2000);
			
		}
		act.sendKeys(Keys.ENTER);
		
	}

}
