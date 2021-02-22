package seleniumPractice.seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseRightClick {

	
	public static WebDriver driver;

	
	@Test
	public void app() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();

		Actions action = new Actions(driver);
		
		WebElement button = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		action.contextClick(button).build().perform();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-cut']")).click();
		
		String actText = driver.switchTo().alert().getText();
		
		if(actText.equals("clicked: cut")) {
			System.out.println("Pass");
			driver.switchTo().alert().accept();
		}else {
			System.out.println("Failed");
		}
		
		
		

		
	}
}
