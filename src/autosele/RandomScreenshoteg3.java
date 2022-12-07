package autosele;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class RandomScreenshoteg3 {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Important\\Shilpa\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://meet.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		 File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 System.out.println(source);
		 String str=RandomString.make(5);
		  File destination = new File("D:\\Important\\Shilpa\\selenium\\screenshot\\abcd"+str+".png");
		  FileHandler.copy(source, destination);

	}

}
