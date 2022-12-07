package setposition;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setpositioneg1 {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Important\\Shilpa\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/");
		driver.manage().window().getPosition();
		System.out.println(driver.manage().window().getPosition());  //get current position
		Thread.sleep(3000);
		Point p=new Point(500,1000);      //to set position we have to call point class and object ofpoint class
		driver.manage().window().setPosition(p);
        System.out.println(driver.manage().window().getPosition());
	}

}
