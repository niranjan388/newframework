package Generic;

import org.testng.annotations.DataProvider;

public class Dataprovider 
{
	@DataProvider(name="Mobile search")
	public static String[][] data()
	{
		String[][] data= {{"Redmi"},{"relame"}};
		
		return data;
	}
	
	

}
