package QAFox.CalendrHandeling;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class TestDataFile {
	
	@DataProvider(name="data")
	public static Object[][] testData1(Method m)
	

	{
		Object[][] obj=null;
		if(m.getName().equals("registerUser1"))	
		
		{    obj=new Object[2][3];
			 obj[0][0]= "Rahul";
			 obj[0][1]= "Kumar";
			 obj[0][2]= 1;
			 obj[1][0]= "Ram";
			 obj[1][1]= "Singh";
			 obj[1][2]= 2;
				 
		}
				
		if(m.getName().equals("registerUser2"))	
			
		{
			 obj=new Object[2][2];
			 obj[0][0]= "Rohan";
			 obj[0][1]= "Kumar";
		
			 obj[1][0]= "Kiran";
			 obj[1][1]= "Singh";
			
			
		}
		return obj;

	}
	
	
	

}
