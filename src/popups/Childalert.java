package popups;

import java.util.Iterator;

import java.util.Set;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childalert {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Important\\Shilpa\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	//	driver.findElement(By.xpath("(//div[@style='text-align: center;'])[1]")).click();
		String mainpageid = driver.getWindowHandle();
		System.out.println(mainpageid);   //returns id of main page
		
		Set<String> allids = driver.getWindowHandles();   //returns set of ids
		System.out.println(allids);
		
		for (String id:allids) 
		{
			System.out.println(id);
		}
		
		Iterator<String> it = allids.iterator();
		mainpageid=it.next();
		String childpageid = it.next();
		System.out.println("main page id is "+mainpageid);
		System.out.println("child page id is "+childpageid);
		
		driver.switchTo().window(childpageid);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		
		

	}

}
