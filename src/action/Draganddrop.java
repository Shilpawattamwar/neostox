package action;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Important\\Shilpa\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		WebElement source = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		Thread.sleep(3000);
		WebElement destination = driver.findElement(By.id("bank"));
		
		Actions act=new Actions(driver);
		
		act.dragAndDrop(source,destination).perform();
		
	//	act.clickAndHold(source).moveToElement(destination).release().build().perform();
		
	
		
	}

	
	}


