package seleniumPractice.seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlePopUp {
	public static WebDriver driver;

	@Test
	public static void myApp() {
		System.setProperty("webdriver.chrome.driver", "E:\\chromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("http://the-internet.herokuapp.com/basic_auth");
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		String text = driver.findElement(By.xpath("//h3[normalize-space()='Basic Auth']")).getText();
		if(text.equals("Basic Auth")) {
			System.out.println("Authentication success");
		}else {
			System.out.println("Authentication Failed");
		}
		
	}
	
}
