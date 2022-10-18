package Testscrpit;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Generic.Baseclass;
import Generic.Dataprovider;
import Generic.Generic_screenshot;
import Generic.utilitymethods;
import POM.POMclass;

public class testcript1 extends Baseclass
{
	
	@Test (dataProvider ="Mobile search",dataProviderClass=Dataprovider.class)
	public  static void search(String mobile) throws AWTException, InterruptedException, IOException
	{
		POMclass prop=new POMclass(driver);
		
		prop.canclebutton().click();
		prop.searchTextfiled().sendKeys(mobile);
		prop.searchbutton().click();
		

		prop.relameMobile().click();
		utilitymethods.windowswitch(driver);
		
		
		Assert.assertEquals(prop.Buynow(), true);
		System.out.println("is enabled");
		prop.Buynow();
		
	
		
		
		
	}
	
}
