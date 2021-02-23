package seleniumPractice.CookieTest;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CookieExample {
	
	public static WebDriver driver;
	
	@Test
	public static void app() {
		System.setProperty("webdriver.chrome.driver", "E:\\chromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.amazon.in/");
		driver.manage().window().maximize();
		
		
		
//////////////// List All The Cookies
		
		Set<Cookie> cookies = driver.manage().getCookies(); // Capture all the cookies from the browser
		System.out.println("Size of Cookie: " + cookies.size());
		
//		for(Cookie cookie:cookies) {
//			System.out.println(cookie.getName()+":"+cookie.getValue()); // print name and value of cookies
//		}
		
		
		
		
////////////////Return specific Cookies according to name
		
		//System.out.println(driver.manage().getCookieNamed("ubid-acbin"));
		
		
/////////////// Add new Cookie to the browser
		
//		Cookie cookieObject = new Cookie("myCookie","123456");
//		driver.manage().addCookie(cookieObject);
//		System.out.println(driver.manage().getCookieNamed("myCookie"));
		
		
		
		
/////////////// Delete a specific Cookie 
		
//		driver.manage().deleteCookie(cookieObject);
//		System.out.println(driver.manage().getCookieNamed("myCookie"));
		
		
		
/////////////// Delete a specific Cookie according to the cookie name
//		driver.manage().deleteCookieNamed("myCookie");
//		System.out.println(driver.manage().getCookieNamed("myCookie"));
		
		
/////////////// Delete all cookie
		driver.manage().deleteAllCookies();
		Set<Cookie> cookiesAfterAllDelete = driver.manage().getCookies();
		System.out.println("Size of Cookie: " + cookiesAfterAllDelete.size());
		
	}
	
	

}
