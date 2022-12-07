package upstoxpomusingexcel;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class Upstoxtestclassusingexcel {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
	//	ChromeOptions options=new ChromeOptions();
		//options.addarguments("--disable-notifications")
	//	options.addArguments("headless");
		
		System.setProperty("webdriver.chrome.driver", "D:\\Important\\Shilpa\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://login-v2.upstox.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));
		driver.manage().window().maximize();
		
		File myfile=new File("D:\\Important\\Shilpa\\eclipse workspace\\examples.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("sheet5");
		
		Upstoxloginusingexcel login=new Upstoxloginusingexcel(driver);
		login.Enteruserid(mysheet.getRow(1).getCell(0).getStringCellValue());
		login.Enterpassword(mysheet.getRow(1).getCell(1).getStringCellValue());
		login.ClickonloginButton();
		Thread.sleep(4000);
	//	driver.manage().timeouts().implicitlyWait(500,TimeUnit.MILLISECONDS);
		
		Upstoxpasscodeusingexcel login2=new Upstoxpasscodeusingexcel(driver);
		login2.Enterpasscode(mysheet.getRow(1).getCell(2).getStringCellValue());

		Thread.sleep(10000);
		//driver.manage().timeouts().implicitlyWait(500,TimeUnit.MILLISECONDS);
		Upstoxwelcomeusingexcel welc=new Upstoxwelcomeusingexcel(driver);
		welc.iamgood();
		Thread.sleep(4000);
		
		Upstoxhomepageusingexcel login3=new Upstoxhomepageusingexcel(driver);
		login3.Useridvalidation();
		login3.fundvalidation();
		login3.Logoutbutton();

	}

}
