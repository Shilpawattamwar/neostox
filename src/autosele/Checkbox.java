package autosele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Important\\Shilpa\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		dropdown.click();
		Select s=new Select(dropdown);
		s.selectByVisibleText("Option2");
		Thread.sleep(3000);
		WebElement hide = driver.findElement(By.id("hide-textbox"));
		hide.click();
		
		WebElement hidebox = driver.findElement(By.id("displayed-text"));                    //isdisplayed
		boolean result = hidebox.isDisplayed();
		System.out.println("result is "+result);
		
		Thread.sleep(3000);
		WebElement checkbox = driver.findElement(By.name("checkBoxOption3"));           //isselected
		checkbox.click();
		boolean result1 = checkbox.isSelected();
		System.out.println("result1 is "+result1);
	}

}
