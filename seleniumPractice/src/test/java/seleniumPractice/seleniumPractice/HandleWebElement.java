package seleniumPractice.seleniumPractice;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HandleWebElement {
	public static WebDriver driver;

	@Test
	public static void  app()
	{

		System.setProperty("webdriver.chrome.driver", "E:\\chromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		driver.manage().window().maximize();
		
		
		// Set input
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Auntor");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Acharja");
		
		
		
		// Drop Down list
		WebElement drptime = driver.findElement(By.xpath("//select[@id='continents']"));
		Select t = new Select(drptime);
		//t.selectByIndex(0);
		//t.selectByValue();
		int optionSize = t.getOptions().size(); // Number of items present in the drop down.
		if(optionSize==7) {
			t.selectByVisibleText("Asia");
			System.out.println(optionSize);
		}else {
			System.out.println("Option size Not Matchs");
		}
		
		
		//Radio Button Selection
		if(driver.findElement(By.xpath("//input[@id='sex-0']")).isEnabled() && driver.findElement(By.xpath("//input[@id='sex-0']")).isSelected()) {
			System.out.println("Male Already Selected");
		}else {
			System.out.println("Male Not Selected");
			driver.findElement(By.xpath("//input[@id='sex-0']")).click();
		}
		
		
		//Check Box Selection
		if(driver.findElement(By.id("profession-0")).isEnabled() && driver.findElement(By.id("profession-1")).isEnabled()) {
			driver.findElement(By.id("profession-1")).click();
		}
		
		if(driver.findElement(By.id("tool-0")).isEnabled() && driver.findElement(By.id("tool-1")).isEnabled() && driver.findElement(By.id("tool-2")).isEnabled()) {
			driver.findElement(By.id("tool-0")).click();
			driver.findElement(By.id("tool-2")).click();
		}
		
		
		//Link
		if(driver.findElement(By.linkText("Click here to Download File")).isDisplayed()==true) {
			driver.findElement(By.linkText("Click here to Download File")).click();
			System.out.println("Link work");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.navigate().back();
		}
		
		
		// Button
		driver.findElement(By.id("submit")).click();
		System.out.println("Button Click");
		
		
		
		
		
		
	   
	}
}
