package upstoxpom;

import java.time.Duration;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Upstoxtestclass {

	public static void main(String[] args) throws InterruptedException 
	{
		
		ChromeOptions options=new ChromeOptions();
		//options.addarguments("--disable-notifications")
		options.addArguments("headless");
		
		System.setProperty("webdriver.chrome.driver", "D:\\Important\\Shilpa\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://login-v2.upstox.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));
		driver.manage().window().maximize();
		
		Upstoxlogin login=new Upstoxlogin(driver);
		login.Enteruserid();
		login.Enterpassword();
		login.ClickonloginButton();
		Thread.sleep(4000);
	//	driver.manage().timeouts().implicitlyWait(500,TimeUnit.MILLISECONDS);
		
		Upstoxpasscodepage login2=new Upstoxpasscodepage(driver);
		login2.Enterpasscode();
		Thread.sleep(10000);
		
		Upstoxwelcome wel=new Upstoxwelcome(driver);
		wel.iamgood();
		Thread.sleep(8000);
		//driver.manage().timeouts().implicitlyWait(500,TimeUnit.MILLISECONDS);
		
		Upstoxhomepage login3=new Upstoxhomepage(driver);
		login3.Useridvalidation();

	}

}
