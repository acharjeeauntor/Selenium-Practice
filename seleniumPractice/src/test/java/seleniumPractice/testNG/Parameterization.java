package seleniumPractice.testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {
	public static WebDriver driver;
	
	@Test
	@Parameters({"browser","url"})
	void setup(String browser,String app) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\chromeDriver\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("","");
			driver = new FirefoxDriver();
		}
		
		driver.get(app);
		
	}
	
	

}
