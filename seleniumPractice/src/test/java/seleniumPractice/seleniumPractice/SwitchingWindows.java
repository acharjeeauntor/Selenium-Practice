package seleniumPractice.seleniumPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SwitchingWindows {
	public static WebDriver driver;
	
	@Test
	public static void  app()
	{

		System.setProperty("webdriver.chrome.driver", "E:\\chromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[normalize-space()='Open New Tabbed Windows']")).click();
		driver.findElement(By.xpath("//a[@href='http://www.selenium.dev']//button[@class='btn btn-info'][normalize-space()='click']")).click();
		//System.out.println(driver.getTitle());
		Set<String> s = driver.getWindowHandles();
		
		//System.out.println(s.size());
		
		for(String i :s) {
			//System.out.println(i);
			String title = driver.switchTo().window(i).getTitle();	
			//System.out.println(title);
			if(title.contains("Frames & windows")) {
				driver.close();
			}else if(title.contains("SeleniumHQ Browser Automation")) {
				driver.findElement(By.xpath("//a[@class='nav-item'][normalize-space()='Blog']")).click();
			}
			
		}
		
		//driver.close();
	   
	}

}
