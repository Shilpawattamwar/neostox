package autosele;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Important\\Shilpa\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/bus-tickets?ref_=perc_bosb_desktop");
	    driver.findElement(By.xpath("//input[@id='ap_email']")).click();
	
		
	//	driver.close();
	//	Thread.sleep(2000);
		
	//	driver.findElement(By.xpath("(//a[@href='sql_alias.asp'])[2]")).click();     //xpath by index
       // driver.close();
        
       driver.navigate().to("https://www.flipkart.com/");
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("abc");  //xpath by attribute
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("def");
        driver.findElement(By.xpath("//input[@type='text']")).clear();
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("XYZ");
	}

}
