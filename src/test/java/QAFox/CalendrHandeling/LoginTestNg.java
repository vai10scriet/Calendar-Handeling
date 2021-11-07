package QAFox.CalendrHandeling;


import org.testng.annotations.Test;

public class LoginTestNg {
	
	
	@Test(dataProviderClass = TestDataFile.class,dataProvider = "data")
	public void registerUser1(String FirstName, String LastName, int Rollnbr ) 
	
	{  
		
		System.out.println("First Name "+FirstName);
		System.out.println("Last Name "+LastName);
		System.out.println("Rollnbr "+Rollnbr);
	
	}
	
	
	@Test(dataProviderClass = TestDataFile.class,dataProvider = "data")
	public void registerUser2(String FirstName, String LastName)
	{
		
		
		System.out.println("First Name "+FirstName);
		System.out.println("Last Name "+LastName);
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
