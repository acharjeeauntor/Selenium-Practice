package seleniumPractice.seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleAlert {
	public static WebDriver driver;
	public  static String acceptedString ="I am an alert box!";
	public  static String acceptedStringForOkAndCancel ="Press a Button !";
	public  static String acceptedStringForTextBox ="Please enter your name";
	public  static String myName ="Auntor";
	
	
	
	@Test
	public static void myApp() {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		////////////////////////// Alert Box With OK Button Example
		
//		driver.findElement(By.xpath("//a[normalize-space()='Alert with OK']")).click();
//		driver.findElement(By.xpath("//button[contains(text(),'click the button to display an')]")).click();
//		String x = driver.switchTo().alert().getText();
//		System.out.println(x);
//		if(x.equals(acceptedString)) {
//			System.out.println("Validate success");
//			driver.switchTo().alert().accept();
//		}else {
//			System.out.println("Validate Failed");
//		}
		
		
		
	//////////////////// 	Alert Box With OK and Cancel Button Example
		
//	driver.findElement(By.xpath("//a[normalize-space()='Alert with OK & Cancel']")).click();
//	driver.findElement(By.xpath("//button[normalize-space()='click the button to display a confirm box']")).click();
//	String x = driver.switchTo().alert().getText();
//	if(x.equals(acceptedStringForOkAndCancel)) {
//		System.out.println("Alert box showing");
//		String ExpOkText="You pressed Ok";
//		String ExpCancelText="You Pressed Cancel";
//		//driver.switchTo().alert().accept();
//		driver.switchTo().alert().dismiss();
//		String a = driver.findElement(By.xpath("//p[@id='demo']")).getText();
//		if(a.equals(ExpOkText)){
//			System.out.println("Test is Passed For Press ok Button");
//		}else if(a.equals(ExpCancelText)){
//			System.out.println("Test is passed For Press Cancel Button");
//		}else {
//			System.out.println("Test is Failed For Ok and Cancel Button");
//		}
//		
//	}else {
//		System.out.println("Alert box not showing");
//	}
//		
		
	
		
	///////////////////// Alert With Text Box

		
driver.findElement(By.xpath("//a[normalize-space()='Alert with Textbox']")).click();
driver.findElement(By.xpath("//button[normalize-space()='click the button to demonstrate the prompt box']")).click();

String x = driver.switchTo().alert().getText();
if(x.equals(acceptedStringForTextBox)) {
	System.out.println("Text Box Validate success");
	driver.switchTo().alert().sendKeys(myName);
	driver.switchTo().alert().accept();
	
	String AccText = driver.findElement(By.xpath("//p[@id='demo1']")).getText();
	if(AccText.equals("Hello "+myName+" How are you today")) {
		System.out.println("Text Is Passed");
	}else {
		System.out.println("Text Is Failed");
	}
	
	
	
	
}else {
	System.out.println("Text Box Validate Failed");
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
