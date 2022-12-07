package verificayionUsingTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyCheckbox {
  @Test
  public void f() throws InterruptedException {
	  
	    System.setProperty("webdriver.chrome.driver", "D:\\Important\\Shilpa\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(3000);
		  WebElement checkbox2 = driver.findElement(By.id("checkBoxOption2"));
	      checkbox2.click();
		  System.out.println("checkbox  is "+checkbox2.isSelected());
		  if(checkbox2.isSelected()) 
		  {
			  System.out.println("checkbox is seleced tc is passed");
		  }
		  else 
		  {
			  System.out.println("checkbox is not selected tc is failed");
		  }
  }
}
