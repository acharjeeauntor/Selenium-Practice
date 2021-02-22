package seleniumPractice.seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHover {
	public static WebDriver driver;
	public static String uName="Admin";
	public static String pass="admin123";
	
	@Test
	public void app() {
		System.setProperty("webdriver.chrome.driver", "E:\\chromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(uName);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(pass);
		driver.findElement(By.xpath("//input[@id='btnLogin']")).submit();
		
		
		Actions action = new Actions(driver);
		
		WebElement admin = driver.findElement(By.xpath("//b[normalize-space()='Admin']"));
		WebElement usermg = driver.findElement(By.xpath("//a[normalize-space()='User Management']"));
		WebElement users = driver.findElement(By.xpath("//a[normalize-space()='Users']"));
		
//		action.moveToElement(admin).build().perform();
//		action.moveToElement(usermg).build().perform();
//		action.moveToElement(users).click().build().perform();
		
		action.moveToElement(admin).moveToElement(usermg).moveToElement(users).click().build().perform();
		
		
	}

}
