package seleniumPractice.seleniumPractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RobotClassForKeyboardEvent {

	public static WebDriver driver;
	
	
	
	
	@Test
	public static void myApp() throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://spreadsheetpage.com/calendar/yearly/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[normalize-space()='Download this template for free']")).click();
		
		// Keyboard event
		
		Robot robot = new Robot();
		
		// this is for press down arrow on keyboard
		//robot.keyPress(KeyEvent.VK_DOWN);
		
		// this is for press Tab button on keyboard [pressing tab activity will go to the next step]
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		
		// this is for press Enter button on keyboard
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		
		System.out.println("test passed");
		
		
		
	}
}
