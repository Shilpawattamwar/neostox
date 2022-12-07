package autosele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettextmethod {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Important\\Shilpa\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hotstar.com/in");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='LOGIN']")).click();
		Thread.sleep(2000);
		WebElement phonenobutton = driver.findElement(By.id("phoneNo"));
		phonenobutton.isEnabled();
		phonenobutton.sendKeys("9561567401");
		driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
		Thread.sleep(5000);
		String result = driver.findElement(By.xpath("//p[@class='error-txt']")).getText();
		System.out.println("error message is "+result);
		
	}

}
