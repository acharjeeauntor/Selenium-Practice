package seleniumPractice.javascriptExecutor;

import java.io.File;
import java.io.IOException;

import org.apache.maven.surefire.shade.org.apache.maven.shared.utils.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DrawingBorderAndScreenShot {
	
public static WebDriver driver;
	
	@Test
	public static void app() throws IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.twoplugs.com/");
		driver.manage().window().maximize();
		
		
		// Those code for make a red border outside element
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		 WebElement button =  driver.findElement(By.xpath("//ul[@class='control-bar']//li[2]//a[1]"));
		WebElement about= driver.findElement(By.xpath("//a[normalize-space()='About']"));
		js.executeScript("arguments[0].style.border='3px solid red'", button);
		js.executeScript("arguments[0].style.border='3px solid red'", about);
		
		
		
		// Take Screenshot and copy the image into screenshot folder  [this code can use for all application]
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File trg = new File("C://screenshot/two.png");
		FileUtils.copyFile(src, trg);
		
		
		
		
		
		
	}

}
