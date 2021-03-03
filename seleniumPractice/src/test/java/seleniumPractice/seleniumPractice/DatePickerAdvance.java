package seleniumPractice.seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DatePickerAdvance {

	String month = "July, 2021";
	String day = "21";
	
	
	//21/07/2021
	
	WebDriver driver;

	@Test
	void app() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.phptravels.net/home");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='checkin']")).click();
		Thread.sleep(2000);

		while (true) {
			String currentDate = driver.findElement(By.xpath(
					"//div[@class='datepicker -bottom-left- -from-bottom- active']//div[@class='datepicker--nav-title']"))
					.getText();
			if (currentDate.equals(month)) {
				break;
			} else {
				driver.findElement(By.xpath(
						"//body/div[@id='datepickers-container']/div[1]/nav//*[local-name()='svg']//*[name()='path' and contains(@d,'M 14,12 l ')]"))
						.click();

			}
		}

		driver.findElement(
				By.xpath("//body/div[@id='datepickers-container']/div[1]/div[1]/div[1]/div[2]/div[" + day + "]"))
				.click();

	}

}
