package QAFox.CalendrHandeling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.tools.jdi.EventSetImpl.Itr;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo3 {
	
	public static void main(String args[])
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		String firstWindow=driver.getWindowHandle();
		System.out.println(firstWindow);
		driver.findElement(By.linkText("Open a popup window")).click();
		Set<String> str=driver.getWindowHandles();		
		Iterator<String> itr=str.iterator();
		while(itr.hasNext())
		{
			String window=itr.next();
			driver.switchTo().window(window);
			if(driver.getTitle().equals("Basic Web Page Title"))
			{
				
				System.out.println("This is second window");
			}
			
			
		}
		
		
	}
	

}
