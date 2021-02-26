package seleniumPractice.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class HardAssertPractice {
	
	public static WebDriver driver;
	
	@Test
	public static void app() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();

		WebElement user = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		WebElement pass = driver.findElement(By.xpath("//input[@id='txtPassword']"));
		WebElement btn = driver.findElement(By.xpath("//input[@id='btnLogin']"));
		
		// First And Short way
		
		Assert.assertTrue(user.isDisplayed());
		user.sendKeys("Admin");
		
		Assert.assertTrue(pass.isDisplayed());
		pass.sendKeys("admin123");
		
//		Assert.assertFalse(user.isDisplayed());
//		user.sendKeys("Admin");
//		
//		Assert.assertFalse(pass.isDisplayed());
//		pass.sendKeys("admin123");
		
		
		
		
		// Second And Long way
		
//		if(user.isDisplayed() && pass.isDisplayed()) {
//			Assert.assertTrue(true);
//			user.sendKeys("Admin");
//			pass.sendKeys("admin123");
//			
//		}else {
//			Assert.fail();
//		}
		
		btn.submit();
		
		String x = driver.findElement(By.xpath("//b[normalize-space()='Buzz']")).getText();
		
		Assert.assertEquals("Buzz", x);
		System.out.println("Test is Passed");
		
		
		
		
	
	}
	
	
	
}
