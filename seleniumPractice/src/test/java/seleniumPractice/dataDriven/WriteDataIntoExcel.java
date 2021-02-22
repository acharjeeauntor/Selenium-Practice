package seleniumPractice.dataDriven;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;
import org.testng.annotations.Test;

public class WriteDataIntoExcel {
	
	@Test
	public static void app() throws IOException {
		
		FileOutputStream file = new FileOutputStream("D:\\SQA-practice\\Selenium\\Selenium-Practice\\seleniumPractice\\ExcelData\\testfile.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Data");
		
		for(int i=0;i<=4;i++) {
			XSSFRow row = sheet.createRow(i);
			for(int j=0;j<=2;j++) {
				row.createCell(j).setCellValue("abc");
			}
		}
		
		workbook.write(file);
		file.close();
		
		
		System.out.println("Written data into the Excel is Completed");
	}
	
	
	

}
