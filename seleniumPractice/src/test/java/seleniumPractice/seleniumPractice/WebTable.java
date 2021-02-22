package seleniumPractice.seleniumPractice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class WebTable {
	
public static WebDriver driver;
public static String uName="Admin";
public static String pass="admin123";
	
	@Test(priority=1)
	public static void  app()
	{

		System.setProperty("webdriver.chrome.driver", "E:\\chromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(uName);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(pass);
		driver.findElement(By.xpath("//input[@id='btnLogin']")).submit();
		
		
		//Actions action = new Actions(driver);
		
		// Admin User Count
//		
//		WebElement admin = driver.findElement(By.xpath("//b[normalize-space()='Admin']"));
//		WebElement usermg = driver.findElement(By.xpath("//a[normalize-space()='User Management']"));
//		WebElement users = driver.findElement(By.xpath("//a[normalize-space()='Users']"));
//		// Mouse Hover
//		action.moveToElement(admin).moveToElement(usermg).moveToElement(users).click().build().perform();
//		
//		int statusCount=0;
//		
//		int row = driver.findElements(By.xpath("//*[@id=\"resultTable\"]/tbody/tr")).size();
//		System.out.println(row);
//		for(int i=1;i<=row;i++) {
//			String status = driver.findElement(By.xpath("//tbody/tr["+i+"]/td[5]")).getText();
//			if(status.equals("Enabled")) {
//				statusCount++;
//			}
//		}
//		
//		System.out.println("No of employess Enabled:" +statusCount);
		
		
		
		
		
		
		// PIM Employee  info List
		
		driver.findElement(By.xpath("//b[normalize-space()='PIM']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Employee List']")).click();
		int row = driver.findElements(By.xpath("//tbody/tr")).size();
		System.out.println("Row: "+row);
		int column = driver.findElements(By.xpath("//th")).size();
		System.out.println("Column: "+column);
		
		for(int i=1;i<=row;i++) {
			for(int j=2;j<=column;j++) {
				System.out.print(driver.findElement(By.xpath("//tbody/tr["+i+"]/td["+j+"]")).getText()+"        ");
			}
			System.out.println();
		}
		
		
	   
	}
	
	

}
