package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class P1 {
	
	public static void main(String args[])
	
	{
		String name="Praveen";
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("http://omayo.blogspot.com/");
		List<WebElement> names =driver.findElements(By.xpath("//table[@id='table1']/tbody/tr/td[1]"));
		List<WebElement> places=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr/td[3]"));
		
		for(int i=0;i<names.size();i++)
			
		{
			String retrievdName=names.get(i).getText();
			if(retrievdName.equals(name))
			{
				
				String retrievdPlaces=places.get(i).getText();
				System.out.println("Place "+retrievdPlaces+ " corresponding to name "+retrievdName);
				
			}
			
		}
		
	}
	

}
