package testNGxml;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class parallelserialexecution1 {
  @Test
  public void flipkartview() throws InterruptedException{
  System.setProperty("webdriver.chrome.driver", "D:\\Important\\Shilpa\\selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	Thread.sleep(10000);
	driver.findElement(By.name("q")).sendKeys("iphone 14");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//div[@class='col col-7-12']//div)[1]")).click();
  }
}
