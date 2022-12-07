package neostoxusingproperties;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class Base1 {
	protected WebDriver driver;
	public void initialisebrowser() throws IOException 
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
	
		System.setProperty("webdriver.chrome.driver", ("D:\\Important\\Shilpa\\selenium\\chromedriver_win32\\chromedriver.exe"));
		 driver=new ChromeDriver();
		driver.get(Utility1.readdatafromproperties("URL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
	}

}
