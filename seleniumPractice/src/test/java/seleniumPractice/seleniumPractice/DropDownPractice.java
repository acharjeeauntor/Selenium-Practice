package seleniumPractice.seleniumPractice;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownPractice{
	public static WebDriver driver;
	
	@Test
	public static void  app()
	{
		List orginalList = new ArrayList();
		List tempList = new ArrayList();

		System.setProperty("webdriver.chrome.driver", "E:\\chromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement element= driver.findElement(By.xpath("//select[@id='animals']"));
		Select se = new Select(element);
		List<WebElement> options = se.getOptions();
		for(WebElement e : options) {
			orginalList.add(e.getText());
			tempList.add(e.getText());
		}
		System.out.println("Before Sort Orginal List:"+orginalList);
		System.out.println("Before Sorting temp lit: "+tempList);
		Collections.sort(tempList);
		System.out.println("After Sorting orginal List: "+tempList);
		System.out.println("After Sorting temp List: "+tempList);
		if(orginalList==tempList) {
			System.out.println("DropDown is Sorted");
		}else {
			System.out.println("DropDown is not Sorted");
		}
		
		driver.close();
	   
	}
}
