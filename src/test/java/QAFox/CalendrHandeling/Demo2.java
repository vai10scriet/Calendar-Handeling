package QAFox.CalendrHandeling;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo2 {
	
	public static void main(String args[]) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/p/page6.html");
		driver.switchTo().frame("dateFrame");
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		driver.findElement(By.id("datepicker")).click();
		String dateToSelect="22/10/2017";

		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
		Date date=sdf.parse(dateToSelect);
		String Stringday=new SimpleDateFormat("dd").format(date);
		int day=Integer.parseInt(Stringday);
		System.out.println(day);
		String stringyear=new SimpleDateFormat("MM").format(date);
		int year=Integer.parseInt(stringyear);
		System.out.println(year);
		while(true)
		{
			String displayedStringYear =driver.findElement(By.cssSelector("span[class='ui-datepicker-year']")).getText();
			int displayedYear = Integer.parseInt(displayedStringYear);
			
		if(displayedYear==year)
		{
			break;
		}
			
		else if(displayedYear>year)
		{
			
			driver.findElement(By.xpath("//span[text()='Prev']")).click();
			
		}
else if(displayedYear<year) {
			
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			
		}
			
			
		}
		
		
		
	}
	

}
