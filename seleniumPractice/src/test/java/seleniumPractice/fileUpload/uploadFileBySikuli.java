package seleniumPractice.fileUpload;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class uploadFileBySikuli {
	public static WebDriver driver;
	
	@Test
	public static void app() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='imagesrc']")).click();
		
		String imagesFilePath = "D:\\SQA-practice\\Selenium\\Selenium-Practice\\seleniumPractice\\images\\screenshot";
		String inputsFilePath="D:\\SQA-practice\\Selenium\\Selenium-Practice\\seleniumPractice\\images\\uploadedimages";
		
//	Screen s = new Screen();
//		
//		Pattern fileInputTextBox = new Pattern(imagesFilePath+"filepath.PNG", 0);
		
		
		
		
		Thread.sleep(2000);
		
	}

}
