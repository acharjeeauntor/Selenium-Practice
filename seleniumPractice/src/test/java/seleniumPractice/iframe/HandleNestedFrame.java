package seleniumPractice.iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleNestedFrame {

	public static WebDriver driver;

	@Test
	public static void app() {
		System.setProperty("webdriver.chrome.driver", "E:\\chromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/nestedframes");
		driver.manage().window().maximize();
		

		driver.switchTo().frame("frame1");
	   WebElement myElement = driver.findElement(By.xpath("//html"));
		driver.switchTo().frame(myElement);
		driver.switchTo().defaultContent();
		
		
	}
}
