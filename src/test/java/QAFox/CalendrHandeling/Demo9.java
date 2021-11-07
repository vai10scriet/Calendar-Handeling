package QAFox.CalendrHandeling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Demo9 {
	
	public static void main(String args[]) throws IOException
	{
		
		File file= new File(System.getProperty("user.dir")+"\\TestData\\TestData.xlsx");
		FileInputStream fis= new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheetAt(0);
		String value=sheet.getRow(1).getCell(1).getStringCellValue();
		System.out.println(value);
				
				
		
	}
	

}
