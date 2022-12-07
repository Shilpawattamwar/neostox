package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpopup {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Important\\Shilpa\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(3000);
		Alert alt = driver.switchTo().alert();
		alt.accept();
		WebElement textonmainpage = driver.findElement(By.xpath("//div[text()='Alerts']"));
		String text = textonmainpage.getText();
		System.out.println(text);
		Thread.sleep(3000);
		driver.findElement(By.id("timerAlertButton")).click();
		
		
		
		
	}

}
