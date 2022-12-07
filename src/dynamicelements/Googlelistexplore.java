package dynamicelements;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlelistexplore {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Important\\Shilpa\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/?&hl=en-GB");
		Thread.sleep(3000);
		driver.manage().window().maximize();
	//	driver.findElement(By.id("L2AGLb")).click();
	//	Thread.sleep(7000);
		
		driver.findElement(By.name("q")).sendKeys("honda amaze");
		Thread.sleep(3000);
		List<WebElement> lists = driver.findElements(By.xpath("//ul[@class='G43f7e']//li"));
		
		for(WebElement li:lists) 
		{
			System.out.println(li.getText());
		
		}
 
	System.out.println("*********************************");
		Iterator<WebElement> itt = lists.iterator();
		while(itt.hasNext())
		{
		
		
			System.out.println(itt.next().getText());
			String name = itt.next().getText();
			String expected = "honda amaze cng";
			if(expected==name)
			{
				System.out.println(name);
			}
			
		}
		
		
		
		
		

	}

}
