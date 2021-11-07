package QAFox.CalendrHandeling;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class Demo4 {
	
	@Test(groups= {"performance"})
	public void feature1()
	{
		
		int a = 10/0;
		System.out.println(" Inside Feature1");
		
		System.out.println(" After Feature1");
	}
	
	@Test(groups= {"smoke"})
	public void feature2()
	{
		System.out.println(" Inside Feature2");
		//throw new SkipException("This has manually failed");
		
		
	}
	
	
	@Test(groups= {"regression","smoke"})
	public void feature3()
	{
		System.out.println(" Inside Feature3");
		
		
	}
	

}
