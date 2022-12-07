package testNGxml;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class parallelserialexecution2 {
  @Test
  public void vctctablehandling() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "D:\\Important\\Shilpa\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement element = driver.findElement(By.xpath("//table[@id='product']//tr[6]/td[2]"));
		System.out.println(element.getText());
  }
}
