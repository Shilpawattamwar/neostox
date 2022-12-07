package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQaExa {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Important\\Shilpa\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.switchTo().frame("frame1");
		WebElement text1 = driver.findElement(By.id("sampleHeading"));
		System.out.println("text in frame1 is "+text1.getText());
		
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
		WebElement text2 = driver.findElement(By.id("sampleHeading"));
		System.out.println("text in frame2 is "+text2.getText());
		
		
		
		
		
		
		
		
		
	}

}
