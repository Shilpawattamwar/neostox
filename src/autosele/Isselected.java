package autosele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isselected {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Important\\Shilpa\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://apps.google.com/intl/en/meet/");
		Thread.sleep(3000);
		WebElement codebox = driver.findElement(By.xpath("(//input[@placeholder='Enter meeting code'])[2]"));
		Thread.sleep(3000);
	//	System.out.println(codebox.isSelected());
		boolean result = codebox.isDisplayed();
		System.out.println("result is "+result);
		codebox.sendKeys("abcd");
		
	}

}
