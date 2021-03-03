package seleniumPractice.seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DatePicker {
	public static WebDriver driver;

	
	
	@Test(priority=1)
	public static void  app() throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "E:\\chromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Datepicker.html");
		driver.manage().window().maximize();
		
		// One Way 
		
		// 22-11-2013
		driver.findElement(By.xpath("//input[@id='datepicker2']")).click();
		
		Select year = new Select(driver.findElement(By.xpath("//select[@title='Change the year']")));
		year.selectByVisibleText("2013");

		
		Select month = new Select(driver.findElement(By.xpath("//select[@title='Change the month']")));
		month.selectByVisibleText("November");
		
		driver.findElement(By.linkText("22")).click();
		
		
		
	}

}
