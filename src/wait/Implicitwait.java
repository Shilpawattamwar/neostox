package wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicitwait {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Important\\Shilpa\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.discoveryplus.in/");
		//Thread.sleep(5000);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		

	}

}
