package seleniumPractice.handleImage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CaptureLogoImage {
	
	
public static WebDriver driver;
	
	@Test
	public static void  app()
	{

		System.setProperty("webdriver.chrome.driver", "E:\\chromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in");
		driver.manage().window().maximize();
		
		
	}

}
