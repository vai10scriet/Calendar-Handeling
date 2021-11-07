package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice.Exit;

public class P3 {
	static WebDriver driver;
	public static void main(String args[])
	
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		String celldata="31";
		int rNum=getRowNumberCellData(celldata);
		if(rNum!=-1)
				 
		{
			       System.out.println("The row number in which the cell value :"+ celldata +" is available is " + rNum);
			       String Location=driver.findElement(By.xpath("//table[@id='table1']/tbody/tr["+rNum+"]/td[3]")).getText();
					
					System.out.println("The location of the person having age "+celldata+" is "+Location);
		
		}
		
		else
			
		{
			
			System.out.println("Data is not available");
			
		}
		
		
		
		
		
	driver.quit();
		
	}
		
	public static int getRowNumberCellData(String celldata)
	
	{	
		List<WebElement> rows=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
		
		for( int i=0;i<rows.size();i++)
		{
			WebElement row= rows.get(i);
			List<WebElement> cells=row.findElements(By.tagName("td"));
			for(int j=0;j<cells.size();j++)
			{
				
				
				String retrievedData=cells.get(j).getText();
				
				if(retrievedData.equals(celldata))
				{
				
					
					return ++i;
					
				}
				
				
			}
			
			
			
			
			
			
		}
		return -1;
		
		
		
		
		
	}
	

}
