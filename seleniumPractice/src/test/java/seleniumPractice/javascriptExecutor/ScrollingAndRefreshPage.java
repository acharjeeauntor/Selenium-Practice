package seleniumPractice.javascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollingAndRefreshPage {

public static WebDriver driver;
	
	@Test
	public static void app() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		// Scrolling by pixel
		js.executeScript("window.scrollBy(0,1000)","");
		
		
		// Scroll page till we find element
		 WebElement flag=driver.findElement(By.xpath("//img[@alt='Flag of Bhutan']"));
		js.executeScript("arguments[0].scrollIntoView();",flag);
		
		
		// Scroll page till bottom
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		
		Thread.sleep(3000);
		
		// For Refresh web page 
		driver.navigate().refresh();
		
	}
	
	
	
	
	
}
