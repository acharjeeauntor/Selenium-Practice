package seleniumPractice.seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Resizable {
	
public static WebDriver driver;
	
	@Test
	public static void  app() throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "E:\\chromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Resizable.html");
		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);
		
		WebElement resize=driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
		
		action.moveToElement(resize).dragAndDropBy(resize, 150, 50).build().perform();
		Thread.sleep(3000);
		
		
	}
	

}
