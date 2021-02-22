package seleniumPractice.dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;
import org.testng.annotations.Test;

public class ReadingDataFromExcel {
	
	@Test
	public static void app() throws IOException {
		FileInputStream file = new FileInputStream("D:\\SQA-practice\\Selenium\\Selenium-Practice\\seleniumPractice\\ExcelData\\MyData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");  // Providing sheet name
		//XSSFSheet sheet = workbook.getSheetAt(0);	//providing sheet index
		
		int rowCount = sheet.getLastRowNum();  // returns the row count
		int cellCount = sheet.getRow(0).getLastCellNum();		// returns the Cell count
		
		System.out.println(rowCount);
		
		for(int i=0;i<rowCount;i++) {
			XSSFRow currentRow=sheet.getRow(i);	// focussed on current rown 
			for(int j=0;j<cellCount;j++) {
				String value = currentRow.getCell(j).toString();   //Read the value
				System.out.print(value+"  ");
			}
			System.out.println();
		}
		
		
		
		
	}

}
