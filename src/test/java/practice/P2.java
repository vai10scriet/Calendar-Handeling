package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class P2 {
	
	public static void main(String args[])
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		int rowsize=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr")).size();
		System.out.println("Number of rows in table" +rowsize);
		int columnize=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr[1]/td")).size();
		System.out.println("Number of columns in table" +columnize);
		
		
		
	}
	
	
	

}
