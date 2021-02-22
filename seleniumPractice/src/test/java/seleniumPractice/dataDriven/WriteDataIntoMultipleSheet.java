package seleniumPractice.dataDriven;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WriteDataIntoMultipleSheet {

	
	@Test
	public static void app() throws IOException {
		
		FileOutputStream file = new FileOutputStream("D:\\SQA-practice\\Selenium\\Selenium-Practice\\seleniumPractice\\ExcelData\\testfile1.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet1 = workbook.createSheet("Data1");
		XSSFSheet sheet2 = workbook.createSheet("Data2");
		
		for(int i=0;i<=4;i++) {
			XSSFRow row1 = sheet1.createRow(i);
			XSSFRow row2 = sheet2.createRow(i);
			for(int j=0;j<=2;j++) {
				row1.createCell(j).setCellValue("abc");
				row2.createCell(j).setCellValue("xyz");
			}
		}
		
		workbook.write(file);
		file.close();
		
		
		System.out.println("Written data into the Multiple Excel is Completed");
	}
}
