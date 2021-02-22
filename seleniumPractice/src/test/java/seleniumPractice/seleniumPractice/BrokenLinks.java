package seleniumPractice.seleniumPractice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrokenLinks {
	
public static WebDriver driver;
	
	@Test
	public static void  app() throws InterruptedException, IOException
	{

		System.setProperty("webdriver.chrome.driver", "E:\\chromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.searchenginejournal.com/404-page-examples/211154/");
		Thread.sleep(1000);
		
		//Capture links from a web page
	List<WebElement> links=driver.findElements(By.tagName("a"));

	//Number of links
	System.out.println(links.size());
	
	for(int i=0;i<links.size();i++) {
		WebElement element = links.get(i);
		String url = element.getAttribute("href");
		URL link = new URL(url);
		//create a connection using url object 'link'
		HttpURLConnection httpConn = (HttpURLConnection) link.openConnection();
		//Wait 2 seconds
		Thread.sleep(2000);
		//Established Connection
		httpConn.connect();
		// Get Response Code
		int resCode = httpConn.getResponseCode();
		
		if(resCode>=400) {
			System.out.println(url +"-"+"is broken link");
		}else {
			System.out.println(url +"-"+"is valid link");
		}
		
	}
		
		
	   
	}

}
