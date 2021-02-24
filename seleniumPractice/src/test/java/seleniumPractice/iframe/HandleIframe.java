package seleniumPractice.iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleIframe {
	
public static WebDriver driver;

@Test
public static void app() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\chromeDriver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
	driver.manage().window().maximize();
	
	
	/////// Switch To Iframe [Two way to switch on iframe: frameElement or name/Id]
	
	//driver.switchTo().frame(frameElement);
	driver.switchTo().frame("globalSqa");
	
	driver.findElement(By.xpath("//input[@id='s']")).sendKeys("Hello World");
	
	driver.switchTo().defaultContent();
	
	
	

	
	
	
	
}

}
