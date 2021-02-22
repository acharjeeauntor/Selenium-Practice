package seleniumPractice.seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop {
	
	
public static WebDriver driver;

	
	@Test
	public void app() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();

		Actions action = new Actions(driver);
		
		WebElement source =driver.findElement(By.xpath("//div[@id='box3']"));
		WebElement target =driver.findElement(By.xpath("//div[@id='box103']"));
		
		//action.clickAndHold(source).moveToElement(target).release().build().perform();
		action.dragAndDrop(source, target).build().perform();
		
		
		Thread.sleep(1000);
		
		
		
	}

}
