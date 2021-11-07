package QAFox.CalendrHandeling;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo1 {
	
	public static void main(String args[]) throws Exception
	{
		String dateTobeSelected ="15/10/2021";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		Date formattedDate=sdf.parse(dateTobeSelected);
		System.out.println(formattedDate);
		
		String days=new SimpleDateFormat("dd").format(formattedDate);
		System.out.println(days);
		int day=Integer.parseInt(days);
		System.out.println(day);
		
		
		//driver.findElement(By.cssSelector("span[class='ui-datepicker-year']")).getText();
		
	}

}
