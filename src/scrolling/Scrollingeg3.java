package scrolling;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import generalised.Screenshotmethod;
import generalised.Scrollintiview;

public class Scrollingeg3 {

	public static void main(String[] args) throws IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Important\\Shilpa\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("");
		
		//=driver.findElement(By.xpath(null));
		Scrollintiview.Scrolling(driver, null);  //call Scrolling static method from anather class
		Thread.sleep(3000);
		Screenshotmethod.Screenshotm(driver,"shilpa");  //call screenshot method from generalisedclass
		
		
		
		
		

	}

}
