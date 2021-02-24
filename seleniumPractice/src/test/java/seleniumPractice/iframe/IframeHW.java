package seleniumPractice.iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IframeHW {
	
	public static WebDriver driver;

	@Test
	public static void app() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		driver.manage().window().maximize();
		
		
		int size = driver.findElements(By.tagName("iframe")).size();
		if(size==3) {
			System.out.println("Validation passed");
		}else {
			System.out.println("Validation Failed");
		}
		
		
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.xpath("//a[normalize-space()='All Classes']")).click();
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		
		driver.switchTo().frame("classFrame");
		driver.findElement(By.xpath("//a[normalize-space()='org.openqa.selenium']")).click();
		
		
		
	}

}
