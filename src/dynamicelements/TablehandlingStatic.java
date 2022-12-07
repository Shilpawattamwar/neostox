package dynamicelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablehandlingStatic {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Important\\Shilpa\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	    List<WebElement> noofrows = driver.findElements(By.xpath("//table[@id='product']//tr"));
		System.out.println(noofrows.size());
		
		List<WebElement> noofcolumns = driver.findElements(By.xpath("//table[@id='product']//th"));  //here xpath//tr/th
		System.out.println(noofcolumns.size());
		
		List<WebElement>noofrows1 = driver.findElements(By.xpath("//table[@id='product']//tr"));
		for(WebElement datainrows:noofrows1) 
		{
			System.out.println(datainrows.getText());
		}
		//we can also write all table with table body's xpath and applying gettext() method on it
		
		
	}

}
