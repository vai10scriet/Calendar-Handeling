package QAFox.CalendrHandeling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Demo5 {
	
	public static void main(String args[]) throws Exception
	{
		
		File src= new File(System.getProperty("user.dir")+"\\TestData\\TestData.xlsx");
		FileInputStream fis= new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);	
		XSSFSheet sheet1=wb.getSheetAt(0);
		String data1=sheet1.getRow(1).getCell(0).getStringCellValue();
		System.out.println("Data from Excel is "+data1);
		
	}
	

}
