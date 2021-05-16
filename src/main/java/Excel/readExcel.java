package Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readExcel {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		XSSFWorkbook wb =null;

		//String testControllerPath = System.getProperty("C:\\Users\\LENOVO\\git\\Selenium_Java-PracticeRekha\\JavaPractice\\readExcelMap.xlsx");
		try {
			//File file = new File(testControllerPath);
			FileInputStream inputStream = new FileInputStream(new File("C:\\Users\\LENOVO\\git\\Selenium_Java-PracticeRekha\\JavaPractice\\readExcelMap.xlsx"));
		
			 wb=new XSSFWorkbook(inputStream);
			
		} catch(FileNotFoundException e) {

		} catch(IOException e) {

		}
		XSSFSheet sheet = wb.getSheet("Employee") ;   //creating a Sheet object to retrieve object
	Row row = 	sheet.getRow(0);
	System.out.print(row.getCell(0));
	
	
	}
}


