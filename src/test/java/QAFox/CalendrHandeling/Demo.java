package QAFox.CalendrHandeling;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {
	
	public static void main(String args[]) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/p/page6.html");
		driver.switchTo().frame("dateFrame");
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		driver.findElement(By.id("datepicker")).click();
		
		String dateTobeSelected ="30/12/2019";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		Date formatedDate=sdf.parse(dateTobeSelected);
		String days=new SimpleDateFormat("dd").format(formatedDate);
		int day=Integer.parseInt(days);
		String stringYear = new SimpleDateFormat("yyyy").format(formatedDate);
		int year = Integer.parseInt(stringYear);
		
		while(true)
		{
			String displayedStringYear = driver.findElement(By.cssSelector("span[class='ui-datepicker-year']")).getText();
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
