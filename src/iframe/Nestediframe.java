package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nestediframe {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Important\\Shilpa\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/nestedframes");

		Thread.sleep(5000);
		driver.switchTo().frame("frame1");
		WebElement frame = driver.findElement(By.xpath("//body[text()='Parent frame']"));
		String text1 = frame.getText();
		System.out.println("text of parent frame is "+text1);
		Thread.sleep(3000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']")));
		WebElement childframe = driver.findElement(By.xpath("//p[text()='Child Iframe']"));
		String text2 = childframe.getText();
		System.out.println("text of child frame is "+text2);
		
		
		
	}

}
