package seleniumPractice.seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.Test;

public class DownloadFiles {

public static WebDriver driver;

	
	
	@Test
	public static void  app() throws InterruptedException
	{

		// Download File using Chrome Driver
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/FileDownload.html");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//textarea[@id='textbox']")).sendKeys("Test");
		driver.findElement(By.xpath("//button[@id='createTxt']")).click();
		driver.findElement(By.xpath("//a[@id='link-to-download']")).click();
		
		
		// Download File using Firefox Driver
		
//				System.setProperty("webdriver.gecko.driver", "Firefox driver location");
//				
//				// create firefox profile object
//				FirefoxProfile profile = new FirefoxProfile();
//				
//				//Set preference to not show file download confirmation dialogue using
//				profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/zip");  //set MIME type
//				profile.setPreference("browser.download.manager.showWhenStarting",false);
//				
//				FirefoxOptions option = new FirefoxOptions();
//				option.setProfile(profile);
//				
//				// Initialized Firefox Driver
//				WebDriver driver = new FirefoxDriver(option);
//				
//				driver.get("http://testingmasters.com/student-corner/downloads/");
//				Thread.sleep(4000);
//				
//				driver.findElement(By.xpath("//tr[@class='row-2 even']//td[@class='column-5']//a[contains(text(),'Download')]")).click();
//				
		
		
		
		
	}
	
	
}
