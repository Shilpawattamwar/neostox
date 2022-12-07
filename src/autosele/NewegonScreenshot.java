package autosele;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewegonScreenshot {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Important\\Shilpa\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone13");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Apple iPhone 13 (128GB) - Green']")).click();
		Thread.sleep(3000);
		driver.switchTo().frame("video");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@aria-labelledby='a-autoid-8-announce']")).click();
		
	}

}
