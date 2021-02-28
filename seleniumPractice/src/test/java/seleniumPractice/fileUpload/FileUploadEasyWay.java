package seleniumPractice.fileUpload;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUploadEasyWay {

	public static WebDriver driver;

	@Test
	public static void app() throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chromeDriver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://tinyupload.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='uploaded_file']")).sendKeys("C:\\Users\\USER\\OneDrive\\Desktop\\Others\\logo.png");
		
		//Runtime.getRuntime().exec("D:\\SQA-Document\\myAllFileUploadScripts\\fileUpload.exe");
		}

}
