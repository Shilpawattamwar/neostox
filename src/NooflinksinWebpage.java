import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NooflinksinWebpage {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Important\\Shilpa\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	    List<WebElement> links = driver.findElements(By.tagName("a"));
	    System.out.println(links.size());
	    for(WebElement listoflinks:links) 
	    {
	    	System.out.println(listoflinks.getText());
	    }
	}

}
