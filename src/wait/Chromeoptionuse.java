package wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chromeoptionuse {

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Important\\Shilpa\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("incognito");
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://www.justdial.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.findElement(By.xpath("//span[text()='Shop Online']")).click();
		
		
		
	

	}

}
