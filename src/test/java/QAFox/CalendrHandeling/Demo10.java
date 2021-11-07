package QAFox.CalendrHandeling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo10 {
	
	
	public static void main(String args[])
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 3);
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		driver.findElement(By.className("dropbtn")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Facebook"))).click();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//driver.findElement(By.linkText("Facebook")).click();
		driver.navigate().back();
		driver.findElement(By.className("dropbtn")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Flipkart"))).click();
		
		
		
		
	}

}
