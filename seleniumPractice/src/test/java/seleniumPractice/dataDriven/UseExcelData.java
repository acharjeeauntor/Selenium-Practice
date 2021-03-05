package seleniumPractice.dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UseExcelData {
	public static WebDriver driver;

	@Test
	public static void myApp() throws IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		driver.manage().window().maximize();

		// Get Data from Excel

		FileInputStream file = new FileInputStream(
				"D:\\SQA-practice\\Selenium\\Selenium-Practice\\seleniumPractice\\ExcelData\\MyData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1"); // Providing sheet name

		String value1 = sheet.getRow(3).getCell(1).getStringCellValue();
		String value2 = sheet.getRow(4).getCell(1).getStringCellValue();

		// Set Excel Data
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(value1);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(value2);
	}

}
