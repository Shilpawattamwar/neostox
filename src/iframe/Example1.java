package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Important\\Shilpa\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_default_default");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.switchTo().frame("iframeResult");
		Thread.sleep(4000);
	
		WebElement sry = driver.findElement(By.xpath("//p[text()='This is a paragraph.']"));
	   System.out.println(sry.getText());

	}

}
