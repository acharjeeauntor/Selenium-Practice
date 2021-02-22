package seleniumPractice.dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CalculationTest {
	
	public static WebDriver driver;
	
	@Test
	public static void app() throws IOException{
		System.setProperty("webdriver.chrome.driver", "E:\\chromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-DBI-BSB001.html");
		driver.manage().window().maximize();
		
		
		FileInputStream file = new FileInputStream("D:\\SQA-practice\\Selenium\\Selenium-Practice\\seleniumPractice\\ExcelData\\caldata.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1"); 
		int noOfRow = sheet.getLastRowNum();
		
		for(int i =1;i<=noOfRow;i++) {
			XSSFRow row = sheet.getRow(i);
			
//			XSSFCell princepleCell = row.getCell(0);
//			int princ = (int) princepleCell.getNumericCellValue();
			
			// Get data from Excel Sheet
			
			int principle = (int) row.getCell(0).getNumericCellValue();
			int roi = (int) row.getCell(1).getNumericCellValue();
			int period = (int) row.getCell(2).getNumericCellValue();
			String frequency = row.getCell(3).getStringCellValue();
			double  maturity = (double) row.getCell(4).getNumericCellValue();
			
			// Add Data on Input form
			
			driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(String.valueOf(principle));
			driver.findElement(By.xpath("//input[@id='interest']")).sendKeys(String.valueOf(roi));
			driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys(String.valueOf(period));
			
			Select periodCombi = new Select(driver.findElement(By.xpath("//select[@id='tenurePeriod']")));
			periodCombi.selectByVisibleText("year(s)");
			
			Select freq = new Select(driver.findElement(By.xpath("//select[@id='frequency']")));
			freq.selectByVisibleText(frequency);
			
			
			// Click for submit those data
			driver.findElement(By.xpath("//div[@class='PT25']//a[1]//img[1]")).click();
			
			
			// Get The calculate value and compare them
			String calculateValue = driver.findElement(By.xpath("//span[@id='resp_matval']")).getText();			
			
			if(Double.parseDouble(calculateValue)==maturity) {
				System.out.println("No: " +i+" Test is Passed");
			}else {
				System.out.println("No: " +i+" Test is Failed");
			}
			
			// Clear the form 
			
//			driver.findElement(By.xpath("//input[@id='principal']")).clear();
//			driver.findElement(By.xpath("//input[@id='interest']")).clear();
//			driver.findElement(By.xpath("//input[@id='tenure']")).clear();
			
			driver.findElement(By.xpath("//img[@class='PL5']")).click();
			
		}
	}

}
