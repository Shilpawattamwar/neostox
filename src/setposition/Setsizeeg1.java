package setposition;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setsizeeg1 {

	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Important\\Shilpa\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/");
		
		Dimension defaultsize = driver.manage().window().getSize();
		System.out.println(defaultsize);
		Thread.sleep(3000);
		
		Dimension d=new Dimension(500,500);      //to set size use dimension class and create object of dimension class 
	    driver.manage().window().setSize(d);      //here is no need to save tis in reference variable
		System.out.println(driver.manage().window().getSize());
		
	}

}
