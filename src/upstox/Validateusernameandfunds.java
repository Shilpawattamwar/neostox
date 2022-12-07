package upstox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validateusernameandfunds {

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Important\\Shilpa\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://login-v2.upstox.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		driver.manage().window().maximize();
		
		driver.findElement(By.name("userId")).sendKeys("4YB8VB");   //sending username
		
		driver.findElement(By.name("password")).sendKeys("Esh@7551gm");   //sending password
		
		driver.findElement(By.xpath("//div[text()='Sign into Upstox']")).click();          //click on sign in button
		
		//navigating to next page(passcode)so take here wait
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));
		
		driver.findElement(By.id("yob")).sendKeys("1993");  //entering birth year in passcode page
		//navigating to next page
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));
		//click on nothanks o to home page-?
		driver.findElement(By.xpath("(//button[@type='button'])[9]")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));
		//we have to validate username
		
		String actualusername = driver.findElement(By.xpath("//span[text()='eshwar t.']")).getText();
		String expectedusername = "Eshwar T.";
		
		if(actualusername.equals(expectedusername))
		{
			System.out.println("Actual and expected usernames are matching, testcase is passed");
		}
		else
		{
			System.out.println("actual and expected username are not matching, testcase is failed");
		}
		
		//validate funds
		driver.findElement(By.id("funds")).click();//clicking on funds button
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		String funds = driver.findElement(By.id("((//div[@class='_2Bthrplw1VYHfLzzQv0asZ'])[1]//div)[1]")).getText();
		System.out.println("Available funds to trade is "+funds);
		
		
		
		
	}

}
